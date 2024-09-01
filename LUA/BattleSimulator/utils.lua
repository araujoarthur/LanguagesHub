local utils = {}

function utils.printHeader()
   print([[
=====================================================================
               _
    _         | |
   | | _______| |---------------------------------------------\
   |:-)_______|==[]============================================>
   |_|        | |---------------------------------------------/
              |_|

               -----------------------------------------

                       ⚔ SIMULADOR DE BATALHA ⚔

=====================================================================

           Você empunha sua espada e se prepara para lutar.
                           É hora da batalha!

]])
end

---Mostra uma barra de progresso
---@param attribute any
---@return string
function utils.getProgressBar(attribute)
   local fullChar = "▰"
   local emptyChar = "▱"

   local result = ""
   for i = 1, 10, 1 do
       if i <= attribute then
           result = result .. fullChar
       else
           result = result .. emptyChar
       end
   end
   return result
end

---Mostra as informações de uma criatura
---@param creature table
function utils.printCreature(creature)
   local healthRate = math.floor((creature.health / creature.maxHealth) * 10)

   -- Cartão
   print("| " .. creature.name)
   print("| ")
   print("| " .. creature.description)
   print("| ")
   print("| Atributos")
   print("|    Vida:         " .. utils.getProgressBar(healthRate))
   print("|    Ataque:       " .. utils.getProgressBar(creature.attack))
   print("|    Defesa:       " .. utils.getProgressBar(creature.defense))
   print("|    Velocidade:   " .. utils.getProgressBar(creature.speed))
end

---Captura a entrada do usuário
---@return any
function utils.ask()
   io.write("> ")
   local answer = io.read ("*n")
   return answer
end

return utils