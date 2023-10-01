/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bean;

import java.util.Set;
import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.RoundEnvironment;
import javax.annotation.processing.SupportedAnnotationTypes;
import javax.annotation.processing.SupportedSourceVersion;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.TypeElement;
import javax.lang.model.element.Element;
import javax.tools.Diagnostic;

/**
 *
 * @author amila
 */
@SupportedAnnotationTypes("bean.WritingStyle")
@SupportedSourceVersion(SourceVersion.RELEASE_8)
public class AnnotationProcessor extends AbstractProcessor {

    @Override
    public boolean process(final Set< ? extends TypeElement> annotations, final RoundEnvironment roundEnv) {
        System.out.println("processor executed");
        for (final Element element : roundEnv.getElementsAnnotatedWith(WritingStyle.class)) {
            System.out.println("element=" + element.getClass().getName());
            String varName = element.getSimpleName().toString();
            if (!(varName.startsWith("teacher"))) {
                processingEnv.getMessager().printMessage(Diagnostic.Kind.ERROR, "Variable Name must start with teacher");
                //   return false;
            }
//            System.out.println("element.getSimpleName()=" + element.getSimpleName());
//            if (element instanceof TypeElement) {     
//                final TypeElement typeElement = (TypeElement) element;
//
//                for (final Element eclosedElement : typeElement.getEnclosedElements()) {
//                    if (eclosedElement instanceof VariableElement) {
//                        final VariableElement variableElement = (VariableElement) eclosedElement;
//
//                        if (variableElement.getConstantValue() == null) {
//                            processingEnv.getMessager().printMessage(Diagnostic.Kind.ERROR, "Bosh Olmasin");
//                            return false;
//                        }
//                    }
//                }
//            }
        }
        return true;
    }
}
