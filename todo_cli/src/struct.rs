use uuid::Uuid;
use chrono::{DateTime, Utc};

enum Priority {
    High,
    Medium,
    Low,
}
struct TodoItems{
    id: Uuid,
    title: String,
    priority: Priority,
    note: Option<String>,
    date: Option<DateTime<Utc>>,
    compleated: bool,
}

struct TodoList {
    items: Vec<TodoItems>,
}

impl TodoItems{
    fn new(id: u32, title: String) -> Self {
        Self{
            id: Uuid::new_v4(),
            title,
            priority,
            note: None,
            date: None,
            compleat: false,
        }
    }
} 

impl TodoList {
    fn new() -> Self {
        Self { 
            items: Vec::new(),
            last_id: 0, 
        }
        
    }
    fn add_todo(id: u32, title: String) {
        self.last_id += 1;
        let id = item.id;
        let item = TodoItems::new(new_id, title);
        self.items.push(item);
        id
    }
    fn remove_todo(&mut self, id: u32) {
        self.item.retain(|item| item.id != id)
    }
    fn update_todo(&mut self, id: u32) {
        if let Some(item) = self.item.iter_mut().find(|i| i.id == id){
            item.toggle_status();
        }
    }
}