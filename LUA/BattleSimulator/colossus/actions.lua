local utils = require("utils")
local actions = {}

actions.list = {}

function actions.build(playerData)
   actions.list = {}

   -- Atacar
   local bodyAttack = {
      description = "Atacar com o corpo.",
      requirement = nil,
      execute = function (playerData, creatureData)
         local successChance = playerData.speed and 1 or creatureData.speed / playerData.speed
         local success = math.random() <= successChance
         
         local rawDamage = creatureData.attack - math.random() * playerData.defense
         local damage = math.max(1, math.ceil(rawDamage))

         if success then
            print(string.format("%s atacou %s e deu %d pontos de dano", creatureData.name, playerData.name, damage))
            playerData.health = playerData.health - damage
            local healthRate = math.floor((playerData.health / playerData.maxHealth) * 10)
            print(string.format("%s: %s", playerData.name, utils.getProgressBar(healthRate)))
         else
            print(string.format("%s tentou atacar, mas errou", creatureData.name))
         end
      end
   }

   local sonarAttack = {
      description = "Ataque sonar",
      requirement = nil,
      execute = function (playerData, creatureData)
      
         local rawDamage = creatureData.attack - math.random() * playerData.defense
         local damage = math.max(1, math.ceil(rawDamage * 0.3))

         -- Aplicação do Dano
         playerData.health = playerData.health - damage

         -- Apresentação do Resultado
         print(string.format("%s usou sonar em %s e aplicou %d pontos de dano", creatureData.name, playerData.name, damage))
         local healthRate = math.floor((playerData.health / playerData.maxHealth) * 10)
         print(string.format("%s: %s", playerData.name, utils.getProgressBar(healthRate)))

      end

   }

   local waitAction = {
      description = "Aguardar",
      requirement = nil,
      execute = function(playerData, creatureData)
         print(string.format("%s não fez nada nesse turno", creatureData.name))
      end
   }

   actions.list[#actions.list + 1] = bodyAttack
   actions.list[#actions.list + 1] = sonarAttack
   actions.list[#actions.list + 1] = waitAction
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