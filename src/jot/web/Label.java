package jot.web;

/**
 * a='111'
 * a.a = function(){
 * 	
 * }
 * @author JJ
 *
 */
public class Label implements ViewObject {

	private String text;

	public Label(String text) {
		super();
		this.text = text;
	}
	
	public void onClick(String fname){
		
	}

	public void bind(Object obj) {
		text = obj.toString();
	}

	@Override
	public String getJson() {
		return "{text:'label'}";
	}

	@Override
	public String getVersion() {
		return "1.0";
	}

	public void setText(String text) {
		this.text = text;
	}

	public static void main(String[] args) {
		String text = "";
		Label a = new Label(text);
		Label b = new Label(text);

	}

}
