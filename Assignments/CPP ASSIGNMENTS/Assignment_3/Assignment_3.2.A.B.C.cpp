/*
 * Assignment_3.2.A.B.C
 *
 *  Created on: 02-Sept-2026
 *      Author: 91703
 */
#include <iostream>
#include <memory>
using namespace std;

class Texture{
	string name;
	int width;
	int height;

public:

	Texture( const string& name,  int width,  int height):name(name),width(width),height(height){
	cout<< "Texture Loaded "<<endl;
	}
	~Texture(){
		cout<<"Texture Released" <<endl;
	}
		void display() const{
			cout<<"Name:"<<name<<endl;
			cout<<"Width:"<<width<<endl;
			cout<<"Height:"<<height<<endl;
		}

};

class Shader{
		string name;
		string type;

public:

		Shader(const string& name ,const string& type) : name(name) , type(type){
			cout<< "Shader Compiled" <<endl;
		}

		~Shader(){
			cout<<"Shader Destroyed"<<endl;
		}
	};

class AudioClip {
	string name;
	double duration;

public:
	AudioClip(const string& name , double duration): name(name), duration(duration){
		cout<< "AudioClip Loaded " <<endl;
	}
	 ~AudioClip(){
		 cout<< "AudioClip Released "<<endl;
	 }
		 string getName() const{
			 return name;
		 }

};

int main2(){
	auto tex1 = make_unique<Texture>("player_sprite", 512, 512);
	tex1->display();

	//unique_ptr<Texture> tex2 = tex1;

	unique_ptr<Texture> tex2 = std::move(tex1);
	cout<<"tex1 is null:" << (tex1 == nullptr ? "YES" : "NO")<<endl;


	auto shader = make_shared<Shader>("main_vert", "vertex");
	cout << "Ref count :" << shader.use_count()<<endl;
	{
		auto rendererRef = shader;
		cout<< "Ref count: " << shader.use_count() <<endl;

		auto editorRef = shader;
		cout << "Ref count: " << shader.use_count() << endl;

	}
	cout << "Ref count: " << shader.use_count() <<endl;


	auto audio = make_shared<AudioClip>("explosion", 3.5);
	weak_ptr<AudioClip> observer = audio;

	if (auto clip = observer.lock()){
		cout<< "Clip alive : " << clip->getName() <<endl;
	}

	audio.reset();

	if(observer.expired()){
		cout<< "Clip already unloaded." <<endl;
	}
	return 0;
}




