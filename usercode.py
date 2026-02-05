def handle(data):
    name = data.get("name", "World")
    amount = data.get("amount", 0)
    
    data["greeting"] = f"Hello, {name}!"
    data["doubled_amount"] = amount * 2
    data["processed"] = True
    
    return data
