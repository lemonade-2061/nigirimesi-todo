use chrono::{DateTime, Utc};
use uuid::Uuid;

pub enum Priority {
    High,
    Medium,
    Low,
}
struct TodoItems {
    pub id: Uuid,
    pub title: String,
    pub priority: Priority,
    pub note: Option<String>,
    pub date: Option<DateTime<Utc>>,
    pub completed: bool,
}

struct TodoList {
    pub items: Vec<TodoItems>,
}

impl TodoItems {
    pub fn new(title: String, priority: Priority) -> Self {
        Self {
            id: Uuid::new_v4(),
            title,
            priority,
            note: None,
            date: None,
            completed: false,
        }
    }
}

impl TodoList {
    pub fn new() -> Self {
        Self { items: Vec::new() }
    }
    pub fn add_todo(&mut self, title: String, priority: Priority) {
        let item = TodoItems::new(title, priority);
        self.items.push(item);
    }
}
