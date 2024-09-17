-- Constants
local ID = "kalandra.cavar_local_estranho"

-- Dependencies
local Node = require("node")
local Choice = require("choice")

-- Create node
local node = Node:new(ID) ---@type Node
node.title = "Praia de Kalandra"
node.description = "Você cavou e encontrou uma chave!"
node.header = [[
                   __
                  /o \_____
                  \__/-="="`
]]

game.hasKey = true

-- Create choices
table.insert(node.choices, Choice:new(
    "kalandra.start",
    "Voltar para a praia"
))


return node