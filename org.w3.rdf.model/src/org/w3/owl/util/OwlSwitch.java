/**
 */
package org.w3.owl.util;

import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.eclipse.uml2.uml.BehavioredClassifier;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.EncapsulatedClassifier;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Namespace;
import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.uml2.uml.ParameterableElement;
import org.eclipse.uml2.uml.RedefinableElement;
import org.eclipse.uml2.uml.StructuredClassifier;
import org.eclipse.uml2.uml.TemplateableElement;
import org.w3.owl.AllDifferent;
import org.w3.owl.AllDisjointClasses;
import org.w3.owl.AllDisjointProperties;
import org.w3.owl.Annotation;
import org.w3.owl.AnnotationProperty;
import org.w3.owl.AnonymousIndividual;
import org.w3.owl.AsymmetricProperty;
import org.w3.owl.Axiom;
import org.w3.owl.DataRange;
import org.w3.owl.Datatype;
import org.w3.owl.DatatypeProperty;
import org.w3.owl.DeprecatedClass;
import org.w3.owl.DeprecatedProperty;
import org.w3.owl.FunctionalProperty;
import org.w3.owl.Individual;
import org.w3.owl.InverseFunctionalProperty;
import org.w3.owl.IrreflexiveProperty;
import org.w3.owl.NamedIndividual;
import org.w3.owl.NegativePropertyAssertion;
import org.w3.owl.Nothing;
import org.w3.owl.ObjectProperty;
import org.w3.owl.Ontology;
import org.w3.owl.OntologyProperty;
import org.w3.owl.OwlPackage;
import org.w3.owl.PropertyChainAxiom;
import org.w3.owl.ReflexiveProperty;
import org.w3.owl.Restriction;
import org.w3.owl.SymmetricProperty;
import org.w3.owl.Thing;
import org.w3.owl.TransitiveProperty;
import org.w3.owl.Type;
import org.w3.owl.TypedThing;
import org.w3.owl.rational;
import org.w3.owl.real;
import org.w3.rdf.RDFProperty;
import org.w3.rdfs.RDFClass;
import org.w3.rdfs.RDFDatatype;
import org.w3.rdfs.RDFLiteral;
import org.w3.rdfs.RDFResource;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.w3.owl.OwlPackage
 * @generated
 */
public class OwlSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static OwlPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OwlSwitch() {
		if (modelPackage == null) {
			modelPackage = OwlPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case OwlPackage.NOTHING: {
				Nothing nothing = (Nothing)theEObject;
				T result = caseNothing(nothing);
				if (result == null) result = caseThing(nothing);
				if (result == null) result = caseTypedThing(nothing);
				if (result == null) result = caseRDFResource(nothing);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OwlPackage.THING: {
				Thing thing = (Thing)theEObject;
				T result = caseThing(thing);
				if (result == null) result = caseTypedThing(thing);
				if (result == null) result = caseRDFResource(thing);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OwlPackage.TYPED_THING: {
				TypedThing typedThing = (TypedThing)theEObject;
				T result = caseTypedThing(typedThing);
				if (result == null) result = caseRDFResource(typedThing);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OwlPackage.ANNOTATION: {
				Annotation annotation = (Annotation)theEObject;
				T result = caseAnnotation(annotation);
				if (result == null) result = caseRDFResource(annotation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OwlPackage.DATA_RANGE: {
				DataRange dataRange = (DataRange)theEObject;
				T result = caseDataRange(dataRange);
				if (result == null) result = caseRDFDatatype(dataRange);
				if (result == null) result = caseRDFClass(dataRange);
				if (result == null) result = caseRDFResource(dataRange);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OwlPackage.OBJECT_PROPERTY: {
				ObjectProperty objectProperty = (ObjectProperty)theEObject;
				T result = caseObjectProperty(objectProperty);
				if (result == null) result = caseRDFDatatype(objectProperty);
				if (result == null) result = caseRDFClass(objectProperty);
				if (result == null) result = caseRDFResource(objectProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OwlPackage.NAMED_INDIVIDUAL: {
				NamedIndividual namedIndividual = (NamedIndividual)theEObject;
				T result = caseNamedIndividual(namedIndividual);
				if (result == null) result = caseIndividual(namedIndividual);
				if (result == null) result = caseThing(namedIndividual);
				if (result == null) result = caseTypedThing(namedIndividual);
				if (result == null) result = caseRDFResource(namedIndividual);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OwlPackage.INDIVIDUAL: {
				Individual individual = (Individual)theEObject;
				T result = caseIndividual(individual);
				if (result == null) result = caseThing(individual);
				if (result == null) result = caseTypedThing(individual);
				if (result == null) result = caseRDFResource(individual);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OwlPackage.REAL: {
				real real = (real)theEObject;
				T result = casereal(real);
				if (result == null) result = caseRDFLiteral(real);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OwlPackage.ONTOLOGY_PROPERTY: {
				OntologyProperty ontologyProperty = (OntologyProperty)theEObject;
				T result = caseOntologyProperty(ontologyProperty);
				if (result == null) result = caseRDFProperty(ontologyProperty);
				if (result == null) result = caseRDFResource(ontologyProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OwlPackage.CLASS: {
				org.w3.owl.Class class_ = (org.w3.owl.Class)theEObject;
				T result = caseClass(class_);
				if (result == null) result = caseType(class_);
				if (result == null) result = caseUML_Class(class_);
				if (result == null) result = caseEncapsulatedClassifier(class_);
				if (result == null) result = caseBehavioredClassifier(class_);
				if (result == null) result = caseStructuredClassifier(class_);
				if (result == null) result = caseClassifier(class_);
				if (result == null) result = caseNamespace(class_);
				if (result == null) result = caseRedefinableElement(class_);
				if (result == null) result = caseUML_Type(class_);
				if (result == null) result = caseTemplateableElement(class_);
				if (result == null) result = casePackageableElement(class_);
				if (result == null) result = caseNamedElement(class_);
				if (result == null) result = caseParameterableElement(class_);
				if (result == null) result = caseElement(class_);
				if (result == null) result = caseEModelElement(class_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OwlPackage.TYPE: {
				Type type = (Type)theEObject;
				T result = caseType(type);
				if (result == null) result = caseUML_Class(type);
				if (result == null) result = caseEncapsulatedClassifier(type);
				if (result == null) result = caseBehavioredClassifier(type);
				if (result == null) result = caseStructuredClassifier(type);
				if (result == null) result = caseClassifier(type);
				if (result == null) result = caseNamespace(type);
				if (result == null) result = caseRedefinableElement(type);
				if (result == null) result = caseUML_Type(type);
				if (result == null) result = caseTemplateableElement(type);
				if (result == null) result = casePackageableElement(type);
				if (result == null) result = caseNamedElement(type);
				if (result == null) result = caseParameterableElement(type);
				if (result == null) result = caseElement(type);
				if (result == null) result = caseEModelElement(type);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OwlPackage.RESTRICTION: {
				Restriction restriction = (Restriction)theEObject;
				T result = caseRestriction(restriction);
				if (result == null) result = caseClass(restriction);
				if (result == null) result = caseType(restriction);
				if (result == null) result = caseUML_Class(restriction);
				if (result == null) result = caseEncapsulatedClassifier(restriction);
				if (result == null) result = caseBehavioredClassifier(restriction);
				if (result == null) result = caseStructuredClassifier(restriction);
				if (result == null) result = caseClassifier(restriction);
				if (result == null) result = caseNamespace(restriction);
				if (result == null) result = caseRedefinableElement(restriction);
				if (result == null) result = caseUML_Type(restriction);
				if (result == null) result = caseTemplateableElement(restriction);
				if (result == null) result = casePackageableElement(restriction);
				if (result == null) result = caseNamedElement(restriction);
				if (result == null) result = caseParameterableElement(restriction);
				if (result == null) result = caseElement(restriction);
				if (result == null) result = caseEModelElement(restriction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OwlPackage.ASYMMETRIC_PROPERTY: {
				AsymmetricProperty asymmetricProperty = (AsymmetricProperty)theEObject;
				T result = caseAsymmetricProperty(asymmetricProperty);
				if (result == null) result = caseObjectProperty(asymmetricProperty);
				if (result == null) result = caseRDFDatatype(asymmetricProperty);
				if (result == null) result = caseRDFClass(asymmetricProperty);
				if (result == null) result = caseRDFResource(asymmetricProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OwlPackage.ANONYMOUS_INDIVIDUAL: {
				AnonymousIndividual anonymousIndividual = (AnonymousIndividual)theEObject;
				T result = caseAnonymousIndividual(anonymousIndividual);
				if (result == null) result = caseIndividual(anonymousIndividual);
				if (result == null) result = caseThing(anonymousIndividual);
				if (result == null) result = caseTypedThing(anonymousIndividual);
				if (result == null) result = caseRDFResource(anonymousIndividual);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OwlPackage.TRANSITIVE_PROPERTY: {
				TransitiveProperty transitiveProperty = (TransitiveProperty)theEObject;
				T result = caseTransitiveProperty(transitiveProperty);
				if (result == null) result = caseObjectProperty(transitiveProperty);
				if (result == null) result = caseRDFDatatype(transitiveProperty);
				if (result == null) result = caseRDFClass(transitiveProperty);
				if (result == null) result = caseRDFResource(transitiveProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OwlPackage.RATIONAL: {
				rational rational = (rational)theEObject;
				T result = caserational(rational);
				if (result == null) result = casereal(rational);
				if (result == null) result = caseRDFLiteral(rational);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OwlPackage.REFLEXIVE_PROPERTY: {
				ReflexiveProperty reflexiveProperty = (ReflexiveProperty)theEObject;
				T result = caseReflexiveProperty(reflexiveProperty);
				if (result == null) result = caseObjectProperty(reflexiveProperty);
				if (result == null) result = caseRDFDatatype(reflexiveProperty);
				if (result == null) result = caseRDFClass(reflexiveProperty);
				if (result == null) result = caseRDFResource(reflexiveProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OwlPackage.ONTOLOGY: {
				Ontology ontology = (Ontology)theEObject;
				T result = caseOntology(ontology);
				if (result == null) result = caseRDFResource(ontology);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OwlPackage.SYMMETRIC_PROPERTY: {
				SymmetricProperty symmetricProperty = (SymmetricProperty)theEObject;
				T result = caseSymmetricProperty(symmetricProperty);
				if (result == null) result = caseObjectProperty(symmetricProperty);
				if (result == null) result = caseRDFDatatype(symmetricProperty);
				if (result == null) result = caseRDFClass(symmetricProperty);
				if (result == null) result = caseRDFResource(symmetricProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OwlPackage.ALL_DISJOINT_PROPERTIES: {
				AllDisjointProperties allDisjointProperties = (AllDisjointProperties)theEObject;
				T result = caseAllDisjointProperties(allDisjointProperties);
				if (result == null) result = caseRDFResource(allDisjointProperties);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OwlPackage.AXIOM: {
				Axiom axiom = (Axiom)theEObject;
				T result = caseAxiom(axiom);
				if (result == null) result = caseRDFResource(axiom);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OwlPackage.DATATYPE_PROPERTY: {
				DatatypeProperty datatypeProperty = (DatatypeProperty)theEObject;
				T result = caseDatatypeProperty(datatypeProperty);
				if (result == null) result = caseRDFProperty(datatypeProperty);
				if (result == null) result = caseRDFResource(datatypeProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OwlPackage.DATATYPE: {
				Datatype datatype = (Datatype)theEObject;
				T result = caseDatatype(datatype);
				if (result == null) result = caseType(datatype);
				if (result == null) result = caseRDFDatatype(datatype);
				if (result == null) result = caseUML_Class(datatype);
				if (result == null) result = caseRDFClass(datatype);
				if (result == null) result = caseEncapsulatedClassifier(datatype);
				if (result == null) result = caseBehavioredClassifier(datatype);
				if (result == null) result = caseRDFResource(datatype);
				if (result == null) result = caseStructuredClassifier(datatype);
				if (result == null) result = caseClassifier(datatype);
				if (result == null) result = caseNamespace(datatype);
				if (result == null) result = caseRedefinableElement(datatype);
				if (result == null) result = caseUML_Type(datatype);
				if (result == null) result = caseTemplateableElement(datatype);
				if (result == null) result = casePackageableElement(datatype);
				if (result == null) result = caseNamedElement(datatype);
				if (result == null) result = caseParameterableElement(datatype);
				if (result == null) result = caseElement(datatype);
				if (result == null) result = caseEModelElement(datatype);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OwlPackage.NEGATIVE_PROPERTY_ASSERTION: {
				NegativePropertyAssertion negativePropertyAssertion = (NegativePropertyAssertion)theEObject;
				T result = caseNegativePropertyAssertion(negativePropertyAssertion);
				if (result == null) result = caseRDFResource(negativePropertyAssertion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OwlPackage.FUNCTIONAL_PROPERTY: {
				FunctionalProperty functionalProperty = (FunctionalProperty)theEObject;
				T result = caseFunctionalProperty(functionalProperty);
				if (result == null) result = caseRDFProperty(functionalProperty);
				if (result == null) result = caseRDFResource(functionalProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OwlPackage.ALL_DISJOINT_CLASSES: {
				AllDisjointClasses allDisjointClasses = (AllDisjointClasses)theEObject;
				T result = caseAllDisjointClasses(allDisjointClasses);
				if (result == null) result = caseRDFResource(allDisjointClasses);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OwlPackage.ALL_DIFFERENT: {
				AllDifferent allDifferent = (AllDifferent)theEObject;
				T result = caseAllDifferent(allDifferent);
				if (result == null) result = caseRDFResource(allDifferent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OwlPackage.IRREFLEXIVE_PROPERTY: {
				IrreflexiveProperty irreflexiveProperty = (IrreflexiveProperty)theEObject;
				T result = caseIrreflexiveProperty(irreflexiveProperty);
				if (result == null) result = caseObjectProperty(irreflexiveProperty);
				if (result == null) result = caseRDFDatatype(irreflexiveProperty);
				if (result == null) result = caseRDFClass(irreflexiveProperty);
				if (result == null) result = caseRDFResource(irreflexiveProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OwlPackage.ANNOTATION_PROPERTY: {
				AnnotationProperty annotationProperty = (AnnotationProperty)theEObject;
				T result = caseAnnotationProperty(annotationProperty);
				if (result == null) result = caseRDFProperty(annotationProperty);
				if (result == null) result = caseRDFResource(annotationProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OwlPackage.INVERSE_FUNCTIONAL_PROPERTY: {
				InverseFunctionalProperty inverseFunctionalProperty = (InverseFunctionalProperty)theEObject;
				T result = caseInverseFunctionalProperty(inverseFunctionalProperty);
				if (result == null) result = caseObjectProperty(inverseFunctionalProperty);
				if (result == null) result = caseRDFDatatype(inverseFunctionalProperty);
				if (result == null) result = caseRDFClass(inverseFunctionalProperty);
				if (result == null) result = caseRDFResource(inverseFunctionalProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OwlPackage.DEPRECATED_CLASS: {
				DeprecatedClass deprecatedClass = (DeprecatedClass)theEObject;
				T result = caseDeprecatedClass(deprecatedClass);
				if (result == null) result = caseRDFClass(deprecatedClass);
				if (result == null) result = caseRDFResource(deprecatedClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OwlPackage.DEPRECATED_PROPERTY: {
				DeprecatedProperty deprecatedProperty = (DeprecatedProperty)theEObject;
				T result = caseDeprecatedProperty(deprecatedProperty);
				if (result == null) result = caseRDFProperty(deprecatedProperty);
				if (result == null) result = caseRDFResource(deprecatedProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OwlPackage.PROPERTY_CHAIN_AXIOM: {
				PropertyChainAxiom propertyChainAxiom = (PropertyChainAxiom)theEObject;
				T result = casePropertyChainAxiom(propertyChainAxiom);
				if (result == null) result = caseObjectProperty(propertyChainAxiom);
				if (result == null) result = caseRDFDatatype(propertyChainAxiom);
				if (result == null) result = caseRDFClass(propertyChainAxiom);
				if (result == null) result = caseRDFResource(propertyChainAxiom);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nothing</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nothing</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNothing(Nothing object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Thing</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Thing</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseThing(Thing object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Typed Thing</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Typed Thing</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypedThing(TypedThing object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnotation(Annotation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Range</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Range</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataRange(DataRange object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectProperty(ObjectProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Individual</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Individual</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedIndividual(NamedIndividual object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Individual</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Individual</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIndividual(Individual object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>real</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>real</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casereal(real object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ontology Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ontology Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOntologyProperty(OntologyProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClass(org.w3.owl.Class object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseType(Type object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Restriction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Restriction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRestriction(Restriction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Asymmetric Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Asymmetric Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAsymmetricProperty(AsymmetricProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Anonymous Individual</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Anonymous Individual</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnonymousIndividual(AnonymousIndividual object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transitive Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transitive Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransitiveProperty(TransitiveProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>rational</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>rational</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caserational(rational object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reflexive Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reflexive Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReflexiveProperty(ReflexiveProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ontology</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ontology</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOntology(Ontology object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Symmetric Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Symmetric Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSymmetricProperty(SymmetricProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>All Disjoint Properties</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>All Disjoint Properties</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAllDisjointProperties(AllDisjointProperties object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Axiom</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Axiom</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAxiom(Axiom object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Datatype Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Datatype Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDatatypeProperty(DatatypeProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Datatype</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Datatype</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDatatype(Datatype object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Negative Property Assertion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Negative Property Assertion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNegativePropertyAssertion(NegativePropertyAssertion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Functional Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Functional Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionalProperty(FunctionalProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>All Disjoint Classes</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>All Disjoint Classes</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAllDisjointClasses(AllDisjointClasses object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>All Different</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>All Different</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAllDifferent(AllDifferent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Irreflexive Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Irreflexive Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIrreflexiveProperty(IrreflexiveProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annotation Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotation Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnotationProperty(AnnotationProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Inverse Functional Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Inverse Functional Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInverseFunctionalProperty(InverseFunctionalProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Deprecated Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Deprecated Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeprecatedClass(DeprecatedClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Deprecated Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Deprecated Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeprecatedProperty(DeprecatedProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property Chain Axiom</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property Chain Axiom</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropertyChainAxiom(PropertyChainAxiom object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RDF Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RDF Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRDFResource(RDFResource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RDF Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RDF Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRDFClass(RDFClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RDF Datatype</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RDF Datatype</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRDFDatatype(RDFDatatype object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RDF Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RDF Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRDFLiteral(RDFLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RDF Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RDF Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRDFProperty(RDFProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EModel Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EModel Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEModelElement(EModelElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElement(Element object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Namespace</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Namespace</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamespace(Namespace object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Redefinable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Redefinable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRedefinableElement(RedefinableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameterable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameterable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameterableElement(ParameterableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Packageable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Packageable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePackageableElement(PackageableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUML_Type(org.eclipse.uml2.uml.Type object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Templateable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Templateable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTemplateableElement(TemplateableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Classifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Classifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassifier(Classifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Structured Classifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Structured Classifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructuredClassifier(StructuredClassifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Encapsulated Classifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Encapsulated Classifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEncapsulatedClassifier(EncapsulatedClassifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Behaviored Classifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Behaviored Classifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBehavioredClassifier(BehavioredClassifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUML_Class(org.eclipse.uml2.uml.Class object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //OwlSwitch
