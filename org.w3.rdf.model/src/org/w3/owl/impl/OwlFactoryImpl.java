/**
 * Copyright (c) 2012 - 2024 Data In Motion and others.
 * All rights reserved. 
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *      Mark Hoffmann - initial API and implementation
 */
package org.w3.owl.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

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
import org.w3.owl.OwlFactory;
import org.w3.owl.OwlPackage;
import org.w3.owl.PropertyChainAxiom;
import org.w3.owl.ReflexiveProperty;
import org.w3.owl.Restriction;
import org.w3.owl.SymmetricProperty;
import org.w3.owl.Thing;
import org.w3.owl.TransitiveProperty;
import org.w3.owl.TypedThing;
import org.w3.owl.rational;
import org.w3.owl.real;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OwlFactoryImpl extends EFactoryImpl implements OwlFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static OwlFactory init() {
		try {
			OwlFactory theOwlFactory = (OwlFactory)EPackage.Registry.INSTANCE.getEFactory(OwlPackage.eNS_URI);
			if (theOwlFactory != null) {
				return theOwlFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new OwlFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OwlFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case OwlPackage.NOTHING: return createNothing();
			case OwlPackage.THING: return createThing();
			case OwlPackage.TYPED_THING: return createTypedThing();
			case OwlPackage.ANNOTATION: return createAnnotation();
			case OwlPackage.DATA_RANGE: return createDataRange();
			case OwlPackage.OBJECT_PROPERTY: return createObjectProperty();
			case OwlPackage.NAMED_INDIVIDUAL: return createNamedIndividual();
			case OwlPackage.INDIVIDUAL: return createIndividual();
			case OwlPackage.REAL: return createreal();
			case OwlPackage.ONTOLOGY_PROPERTY: return createOntologyProperty();
			case OwlPackage.CLASS: return createClass();
			case OwlPackage.RESTRICTION: return createRestriction();
			case OwlPackage.ASYMMETRIC_PROPERTY: return createAsymmetricProperty();
			case OwlPackage.ANONYMOUS_INDIVIDUAL: return createAnonymousIndividual();
			case OwlPackage.TRANSITIVE_PROPERTY: return createTransitiveProperty();
			case OwlPackage.RATIONAL: return createrational();
			case OwlPackage.REFLEXIVE_PROPERTY: return createReflexiveProperty();
			case OwlPackage.ONTOLOGY: return createOntology();
			case OwlPackage.SYMMETRIC_PROPERTY: return createSymmetricProperty();
			case OwlPackage.ALL_DISJOINT_PROPERTIES: return createAllDisjointProperties();
			case OwlPackage.AXIOM: return createAxiom();
			case OwlPackage.DATATYPE_PROPERTY: return createDatatypeProperty();
			case OwlPackage.DATATYPE: return createDatatype();
			case OwlPackage.NEGATIVE_PROPERTY_ASSERTION: return createNegativePropertyAssertion();
			case OwlPackage.FUNCTIONAL_PROPERTY: return createFunctionalProperty();
			case OwlPackage.ALL_DISJOINT_CLASSES: return createAllDisjointClasses();
			case OwlPackage.ALL_DIFFERENT: return createAllDifferent();
			case OwlPackage.IRREFLEXIVE_PROPERTY: return createIrreflexiveProperty();
			case OwlPackage.ANNOTATION_PROPERTY: return createAnnotationProperty();
			case OwlPackage.INVERSE_FUNCTIONAL_PROPERTY: return createInverseFunctionalProperty();
			case OwlPackage.DEPRECATED_CLASS: return createDeprecatedClass();
			case OwlPackage.DEPRECATED_PROPERTY: return createDeprecatedProperty();
			case OwlPackage.PROPERTY_CHAIN_AXIOM: return createPropertyChainAxiom();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Nothing createNothing() {
		NothingImpl nothing = new NothingImpl();
		return nothing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Thing createThing() {
		ThingImpl thing = new ThingImpl();
		return thing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypedThing createTypedThing() {
		TypedThingImpl typedThing = new TypedThingImpl();
		return typedThing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Annotation createAnnotation() {
		AnnotationImpl annotation = new AnnotationImpl();
		return annotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataRange createDataRange() {
		DataRangeImpl dataRange = new DataRangeImpl();
		return dataRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ObjectProperty createObjectProperty() {
		ObjectPropertyImpl objectProperty = new ObjectPropertyImpl();
		return objectProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NamedIndividual createNamedIndividual() {
		NamedIndividualImpl namedIndividual = new NamedIndividualImpl();
		return namedIndividual;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Individual createIndividual() {
		IndividualImpl individual = new IndividualImpl();
		return individual;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public real createreal() {
		realImpl real = new realImpl();
		return real;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OntologyProperty createOntologyProperty() {
		OntologyPropertyImpl ontologyProperty = new OntologyPropertyImpl();
		return ontologyProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.w3.owl.Class createClass() {
		ClassImpl class_ = new ClassImpl();
		return class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Restriction createRestriction() {
		RestrictionImpl restriction = new RestrictionImpl();
		return restriction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AsymmetricProperty createAsymmetricProperty() {
		AsymmetricPropertyImpl asymmetricProperty = new AsymmetricPropertyImpl();
		return asymmetricProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnonymousIndividual createAnonymousIndividual() {
		AnonymousIndividualImpl anonymousIndividual = new AnonymousIndividualImpl();
		return anonymousIndividual;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TransitiveProperty createTransitiveProperty() {
		TransitivePropertyImpl transitiveProperty = new TransitivePropertyImpl();
		return transitiveProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public rational createrational() {
		rationalImpl rational = new rationalImpl();
		return rational;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReflexiveProperty createReflexiveProperty() {
		ReflexivePropertyImpl reflexiveProperty = new ReflexivePropertyImpl();
		return reflexiveProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Ontology createOntology() {
		OntologyImpl ontology = new OntologyImpl();
		return ontology;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SymmetricProperty createSymmetricProperty() {
		SymmetricPropertyImpl symmetricProperty = new SymmetricPropertyImpl();
		return symmetricProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AllDisjointProperties createAllDisjointProperties() {
		AllDisjointPropertiesImpl allDisjointProperties = new AllDisjointPropertiesImpl();
		return allDisjointProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Axiom createAxiom() {
		AxiomImpl axiom = new AxiomImpl();
		return axiom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DatatypeProperty createDatatypeProperty() {
		DatatypePropertyImpl datatypeProperty = new DatatypePropertyImpl();
		return datatypeProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Datatype createDatatype() {
		DatatypeImpl datatype = new DatatypeImpl();
		return datatype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NegativePropertyAssertion createNegativePropertyAssertion() {
		NegativePropertyAssertionImpl negativePropertyAssertion = new NegativePropertyAssertionImpl();
		return negativePropertyAssertion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FunctionalProperty createFunctionalProperty() {
		FunctionalPropertyImpl functionalProperty = new FunctionalPropertyImpl();
		return functionalProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AllDisjointClasses createAllDisjointClasses() {
		AllDisjointClassesImpl allDisjointClasses = new AllDisjointClassesImpl();
		return allDisjointClasses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AllDifferent createAllDifferent() {
		AllDifferentImpl allDifferent = new AllDifferentImpl();
		return allDifferent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IrreflexiveProperty createIrreflexiveProperty() {
		IrreflexivePropertyImpl irreflexiveProperty = new IrreflexivePropertyImpl();
		return irreflexiveProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnnotationProperty createAnnotationProperty() {
		AnnotationPropertyImpl annotationProperty = new AnnotationPropertyImpl();
		return annotationProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InverseFunctionalProperty createInverseFunctionalProperty() {
		InverseFunctionalPropertyImpl inverseFunctionalProperty = new InverseFunctionalPropertyImpl();
		return inverseFunctionalProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeprecatedClass createDeprecatedClass() {
		DeprecatedClassImpl deprecatedClass = new DeprecatedClassImpl();
		return deprecatedClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeprecatedProperty createDeprecatedProperty() {
		DeprecatedPropertyImpl deprecatedProperty = new DeprecatedPropertyImpl();
		return deprecatedProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PropertyChainAxiom createPropertyChainAxiom() {
		PropertyChainAxiomImpl propertyChainAxiom = new PropertyChainAxiomImpl();
		return propertyChainAxiom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OwlPackage getOwlPackage() {
		return (OwlPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static OwlPackage getPackage() {
		return OwlPackage.eINSTANCE;
	}

} //OwlFactoryImpl
