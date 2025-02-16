def zipmap(keys, values):
  d = dict()
  if keys and values:
      d[keys.pop(0)] = values.pop(0)
      d.update(zipmap(keys, values))       
  return d
