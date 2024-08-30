local function getMaxHealth(vit)
   return vit * 1.25
end

local function getPhysicalAttack(str)
   return str * .25
end

local function getMagicalAttack(mag)
   return mag * .1
end

local function getResistence(res)
   return res * 1.5
end

local function printSkills(skills)
   local result = ""
   for index, value in ipairs(skills) do
      if result == "" then
         result = value
      else
         result = result .. ", " .. value
      end
   end
   print(result)
end

local function printCard(chName, chClass, chZodiac, attr, skills)
   print("===========================================================")
   print(" NAME: " .. chName .. " | CLASS: " .. chClass .. " | ZODIAC: " .. chZodiac)
   print("===========================================================")
   print("")
   print(" Attributes: ")
   print("  Health: " .. getMaxHealth(attr["vitality"]))
   print("  Physical Attack: " .. getPhysicalAttack(attr["strength"]))
   print("  Magical Attack: " .. getMagicalAttack(attr["magic"]))
   print("  Defense: " .. getResistence(attr["resistence"]))
   print("===========================================================")
   print("Skills:")
   printSkills(skills)
   print("")
   print("===========================================================")
end

local characterName = "TestChar"
local characterClass = "Rogue"
local characterZodiac = "Scorpio"

local attributes = {}
attributes["strength"] = 10
attributes["vitality"] = 25
attributes["resistence"] = 5
attributes["magic"] = 1

local skills = {}
skills[1] = "Bloodsteal"
skills[2] = "Fast Attack"

printCard(characterName, characterClass, characterZodiac, attributes, skills)

