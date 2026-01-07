use uuid::Uuid;
use chrono::{DateTime, Utc}

enum Priority {
    High,
    Medium,
    Low,
}

#[derive(Debug)]
struct TodoItem {
    id: Uuid,
    title: String,
    note: Option<String>
    due_date: Option<DateTime<Utc>>
    priority: Priority,
    is_completed: bool,
}

impl TodoItem {
    fn new(title: String) -> Self {
        Self {
            id,
            title,
            is_completed: false,
        }
    }
}

struct TodoList {
    items: Vec<TodoItem>,
    last_id: u32,
}

impl TodoList {
    fn add_task(&mut self, title:String) {
        let new_id = (last_id + 1) as u32;
        let new_item = TodoItem::new(new_id, title);
        self.item.push(item)
    }
    fn update_task(&mut self, id: u32){
        if let Some(item) = self.items.iter_mut().find(|i| i.id == id) {
            item.target_status();
        } 
    }
    fn remove_task(&mut self, id: u32) {
        self.item.return(|item| item.id != id);
    }
}
