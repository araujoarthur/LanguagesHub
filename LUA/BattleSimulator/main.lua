-- Dependencias
local utils = require("utils")
local colossus = require("colossus.colossus")
local player = require("player.player")
local playerActions = require("player.actions")
local colossusActions = require("colossus.actions")


local boss = colossus
local bossActions = colossusActions

utils.printHeader()
utils.printCreature(colossus)

playerActions.build()
bossActions.build()

while true do
   print("O que você deseja fazerm em seguida?")
   local validPlayerActions = playerActions.getValidActions(player, boss)
   for i, action in pairs(validPlayerActions) do
      print(string.format("%d. %s", i, action.description))
   end

   local chosenIndex = utils.ask()
   local chosenAction = validPlayerActions[chosenIndex]
   local isActionValid = chosenAction ~= nil

   if isActionValid then
      chosenAction.execute(player, boss)
   else
      print("Sua ação é invalida. Perdeu a vez.")
   end

   if boss.health <= 0 then
      break
   end

   print()
   local validBossActions = bossActions.getValidActions(player, boss)
   local bossAction = validBossActions[math.random(#validBossActions)]
   bossAction.execute(player, boss)

   if player.health <= 0 then
      break
   end
end

if player.health <= 0 then
   print("%s morreu.", player.name)
end

if boss.health <= 0 then
   print("%s morreu.", boss.name)
end