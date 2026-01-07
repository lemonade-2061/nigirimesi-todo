use serde::{Serialize};
use std::fs::File;
use std::io::Write;
use std::error::Error;

fn strage() -> Result<(), Box<dyn Error>> {
    //itemは仮で入れとく
    let item = TodoItems::new(1, "aaa".to_string());
    let todo_list = TodoList {
        items: vec![item],
    };
    let json_data = serde_json::to_string_pretty(&todo_list)?;

    let file_path = "output.json";
    let mut file = File::create(file_path)?;
    file.write_all(json_data.as_bytes())?;

    Ok(())
}