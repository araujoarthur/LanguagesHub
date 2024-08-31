-- Dependencias
local utils = require("utils")
local colossus = require("colossus.colossus")
local player = require("player.player")

local boss = colossus

utils.printHeader()
utils.printCreature(colossus)

while true do
   if boss.health <= 0 then
      break
   end

   if player.health <= 0 then
      break
   end
end