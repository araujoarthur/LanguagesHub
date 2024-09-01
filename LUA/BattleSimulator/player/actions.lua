local utils = require("utils")
local actions = {}

actions.list = {}

function actions.build(playerData)
   actions.list = {}
   local swordAttack = {
      description = "Atacar com Espada.",
      requirement = nil,
      execute = function (playerData, creatureData)
         local successChance = creatureData.speed and 1 or playerData.speed / creatureData.speed
         local success = math.random() <= successChance
         
         local rawDamage = playerData.attack - math.random() * creatureData.defense
         local damage = math.max(1, math.ceil(rawDamage))

         if success then
            print(string.format("%s atacou %s e deu %d pontos de dano", playerData.name, creatureData.name, damage))
            creatureData.health = creatureData.health - damage
            local healthRate = math.floor((creatureData.health / creatureData.maxHealth) * 10)
            print(string.format("%s: %s", creatureData.name, utils.getProgressBar(healthRate)))
         else
            print(string.format("%s tentou atacar, mas esqueceu a espada na mochila", playerData.name))
         end
      end
   }

   local regenPotion = {
      description = "Tomar uma poção de regeneração.",
      requirement = function(playerData, creatureData)
         return playerData.potions >= 1
      end,
      execute = function(playerData, creatureData)
         playerData.potions = playerData.potions - 1
         local regenPoints = 5
         playerData.health = playerData.health + math.min(playerData.maxHealth, playerData.health + regenPoints)
         print(string.format("%s usou uma poção e recuperou vida", playerData.name))
      end
   }

   actions.list[#actions.list + 1] = swordAttack
   actions.list[#actions.list + 1] = regenPotion
end

---Retorna as ações validas
---@param playerData table
---@param creatureData table
---@return table
function actions.getValidActions(playerData, creatureData)
   local validActions = {}

   for _, action in pairs(actions.list) do
      local isValid = action.requirement == nil or action.requirement(playerData, creatureData)
      if isValid then
         validActions[#validActions + 1] = action
      end
   end

   return validActions
end

return actions