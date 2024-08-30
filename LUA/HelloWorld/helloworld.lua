
--- comentário de documentação
local STRING_CONST <const> = "Creeper" -- Comentário em lua
local numberVar = 20 -- Os números sempre são pontos flutuantes em lua.
local boolean_variable = true;

--[[
Multiline comment
]]



print(type(STRING_CONST));
print(type(numberVar));
print(type(boolean_variable));
print(type(type))

numberVar = numberVar + 10;
print(numberVar)
print(numberVar + 100)
numberVar = numberVar/2
print(numberVar)
print(numberVar ^ 2)

if numberVar >= 10 then
   print("Hello")
else
   print("No Hello")
end

if numberVar ~= 10 then
   print("Em lua o diferente é ~=")
end

if not not boolean_variable then
   print("not nega booleanas")
end

numberVar = 0;

while numberVar <= 10 do
   numberVar = numberVar + 1
end

repeat
   numberVar = numberVar - 1
   print(numberVar)
until numberVar <= 0

--[[
O limite é inclusivo
for initial, limit, increment do 
...
end
]]
for i = 1, 10, 1 do
   print(i)
end