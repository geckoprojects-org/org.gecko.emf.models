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
package org.w3.rdf.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.eclipse.uml2.types.TypesPackage;

import org.eclipse.uml2.uml.UMLPackage;

import org.w3.owl.OwlPackage;

import org.w3.owl.impl.OwlPackageImpl;

import org.w3.rdf.Alt;
import org.w3.rdf.Bag;
import org.w3.rdf.First;
import org.w3.rdf.RDFList;
import org.w3.rdf.RDFObject;
import org.w3.rdf.RDFPredicate;
import org.w3.rdf.RDFProperty;
import org.w3.rdf.RDFStatement;
import org.w3.rdf.RDFSubject;
import org.w3.rdf.RDFType;
import org.w3.rdf.RDFValue;
import org.w3.rdf.RdfFactory;
import org.w3.rdf.RdfPackage;
import org.w3.rdf.Rest;
import org.w3.rdf.Seq;

import org.w3.rdfs.RdfsPackage;

import org.w3.rdfs.impl.RdfsPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RdfPackageImpl extends EPackageImpl implements RdfPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rdfListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass restEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass altEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bagEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iriEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rdfSubjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rdfStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rdfPredicateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rdfTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rdfValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass firstEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass seqEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rdfObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rdfuriEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rdfPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType primitiveLiteralEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.w3.rdf.RdfPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RdfPackageImpl() {
		super(eNS_URI, RdfFactory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link RdfPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RdfPackage init() {
		if (isInited) return (RdfPackage)EPackage.Registry.INSTANCE.getEPackage(RdfPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredRdfPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		RdfPackageImpl theRdfPackage = registeredRdfPackage instanceof RdfPackageImpl ? (RdfPackageImpl)registeredRdfPackage : new RdfPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();
		TypesPackage.eINSTANCE.eClass();
		UMLPackage.eINSTANCE.eClass();
		XMLTypePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(OwlPackage.eNS_URI);
		OwlPackageImpl theOwlPackage = (OwlPackageImpl)(registeredPackage instanceof OwlPackageImpl ? registeredPackage : OwlPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(RdfsPackage.eNS_URI);
		RdfsPackageImpl theRdfsPackage = (RdfsPackageImpl)(registeredPackage instanceof RdfsPackageImpl ? registeredPackage : RdfsPackage.eINSTANCE);

		// Create package meta-data objects
		theRdfPackage.createPackageContents();
		theOwlPackage.createPackageContents();
		theRdfsPackage.createPackageContents();

		// Initialize created meta-data
		theRdfPackage.initializePackageContents();
		theOwlPackage.initializePackageContents();
		theRdfsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRdfPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RdfPackage.eNS_URI, theRdfPackage);
		return theRdfPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRDFList() {
		return rdfListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRDFList_Rest() {
		return (EReference)rdfListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRDFList_First() {
		return (EReference)rdfListEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRest() {
		return restEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRest_Parent() {
		return (EReference)restEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAlt() {
		return altEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBag() {
		return bagEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIRI() {
		return iriEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIRI_Iri() {
		return (EAttribute)iriEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRDFSubject() {
		return rdfSubjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRDFSubject_Statement() {
		return (EReference)rdfSubjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRDFStatement() {
		return rdfStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRDFStatement_Predicate() {
		return (EReference)rdfStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRDFStatement_Object() {
		return (EReference)rdfStatementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRDFStatement_Subject() {
		return (EReference)rdfStatementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRDFPredicate() {
		return rdfPredicateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRDFPredicate_Statement() {
		return (EReference)rdfPredicateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRDFType() {
		return rdfTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRDFType_Resource() {
		return (EReference)rdfTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRDFType_Type() {
		return (EReference)rdfTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRDFValue() {
		return rdfValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRDFValue_Resource() {
		return (EReference)rdfValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRDFValue_Value() {
		return (EReference)rdfValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFirst() {
		return firstEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFirst_Parent() {
		return (EReference)firstEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFirst_First() {
		return (EReference)firstEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSeq() {
		return seqEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRDFObject() {
		return rdfObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRDFObject_Statement() {
		return (EReference)rdfObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRDFURI() {
		return rdfuriEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRDFProperty() {
		return rdfPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRDFProperty_Domain() {
		return (EReference)rdfPropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRDFProperty_SubPropertyOf() {
		return (EReference)rdfPropertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRDFProperty_Range() {
		return (EReference)rdfPropertyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getPrimitiveLiteral() {
		return primitiveLiteralEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RdfFactory getRdfFactory() {
		return (RdfFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		rdfListEClass = createEClass(RDF_LIST);
		createEReference(rdfListEClass, RDF_LIST__REST);
		createEReference(rdfListEClass, RDF_LIST__FIRST);

		restEClass = createEClass(REST);
		createEReference(restEClass, REST__PARENT);

		altEClass = createEClass(ALT);

		bagEClass = createEClass(BAG);

		iriEClass = createEClass(IRI);
		createEAttribute(iriEClass, IRI__IRI);

		rdfSubjectEClass = createEClass(RDF_SUBJECT);
		createEReference(rdfSubjectEClass, RDF_SUBJECT__STATEMENT);

		rdfStatementEClass = createEClass(RDF_STATEMENT);
		createEReference(rdfStatementEClass, RDF_STATEMENT__PREDICATE);
		createEReference(rdfStatementEClass, RDF_STATEMENT__OBJECT);
		createEReference(rdfStatementEClass, RDF_STATEMENT__SUBJECT);

		rdfPredicateEClass = createEClass(RDF_PREDICATE);
		createEReference(rdfPredicateEClass, RDF_PREDICATE__STATEMENT);

		rdfTypeEClass = createEClass(RDF_TYPE);
		createEReference(rdfTypeEClass, RDF_TYPE__RESOURCE);
		createEReference(rdfTypeEClass, RDF_TYPE__TYPE);

		rdfValueEClass = createEClass(RDF_VALUE);
		createEReference(rdfValueEClass, RDF_VALUE__RESOURCE);
		createEReference(rdfValueEClass, RDF_VALUE__VALUE);

		firstEClass = createEClass(FIRST);
		createEReference(firstEClass, FIRST__PARENT);
		createEReference(firstEClass, FIRST__FIRST);

		seqEClass = createEClass(SEQ);

		rdfObjectEClass = createEClass(RDF_OBJECT);
		createEReference(rdfObjectEClass, RDF_OBJECT__STATEMENT);

		rdfuriEClass = createEClass(RDFURI);

		rdfPropertyEClass = createEClass(RDF_PROPERTY);
		createEReference(rdfPropertyEClass, RDF_PROPERTY__DOMAIN);
		createEReference(rdfPropertyEClass, RDF_PROPERTY__SUB_PROPERTY_OF);
		createEReference(rdfPropertyEClass, RDF_PROPERTY__RANGE);

		// Create data types
		primitiveLiteralEDataType = createEDataType(PRIMITIVE_LITERAL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		RdfsPackage theRdfsPackage = (RdfsPackage)EPackage.Registry.INSTANCE.getEPackage(RdfsPackage.eNS_URI);
		TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		rdfListEClass.getESuperTypes().add(theRdfsPackage.getRDFResource());
		restEClass.getESuperTypes().add(this.getRDFList());
		altEClass.getESuperTypes().add(theRdfsPackage.getRDFContainer());
		bagEClass.getESuperTypes().add(theRdfsPackage.getRDFContainer());
		rdfStatementEClass.getESuperTypes().add(theRdfsPackage.getRDFResource());
		seqEClass.getESuperTypes().add(theRdfsPackage.getRDFContainer());
		rdfuriEClass.getESuperTypes().add(this.getIRI());
		rdfPropertyEClass.getESuperTypes().add(theRdfsPackage.getRDFResource());

		// Initialize classes and features; add operations and parameters
		initEClass(rdfListEClass, RDFList.class, "RDFList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRDFList_Rest(), this.getRest(), this.getRest_Parent(), "rest", null, 0, -1, RDFList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRDFList_First(), this.getFirst(), this.getFirst_Parent(), "first", null, 0, 1, RDFList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(restEClass, Rest.class, "Rest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRest_Parent(), this.getRDFList(), this.getRDFList_Rest(), "parent", null, 1, 1, Rest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(altEClass, Alt.class, "Alt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(bagEClass, Bag.class, "Bag", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(iriEClass, org.w3.rdf.IRI.class, "IRI", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIRI_Iri(), theTypesPackage.getString(), "iri", null, 1, 1, org.w3.rdf.IRI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(rdfSubjectEClass, RDFSubject.class, "RDFSubject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRDFSubject_Statement(), this.getRDFStatement(), this.getRDFStatement_Subject(), "statement", null, 1, 1, RDFSubject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(rdfStatementEClass, RDFStatement.class, "RDFStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRDFStatement_Predicate(), this.getRDFPredicate(), this.getRDFPredicate_Statement(), "predicate", null, 1, 1, RDFStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRDFStatement_Object(), this.getRDFObject(), this.getRDFObject_Statement(), "object", null, 1, 1, RDFStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRDFStatement_Subject(), this.getRDFSubject(), this.getRDFSubject_Statement(), "subject", null, 1, 1, RDFStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(rdfPredicateEClass, RDFPredicate.class, "RDFPredicate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRDFPredicate_Statement(), this.getRDFStatement(), this.getRDFStatement_Predicate(), "statement", null, 1, 1, RDFPredicate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(rdfTypeEClass, RDFType.class, "RDFType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRDFType_Resource(), theRdfsPackage.getRDFResource(), theRdfsPackage.getRDFResource_RdfType(), "resource", null, 1, 1, RDFType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRDFType_Type(), theRdfsPackage.getRDFClass(), null, "type", null, 1, 1, RDFType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(rdfValueEClass, RDFValue.class, "RDFValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRDFValue_Resource(), theRdfsPackage.getRDFResource(), null, "resource", null, 1, 1, RDFValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRDFValue_Value(), theRdfsPackage.getRDFResource(), null, "value", null, 0, -1, RDFValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(firstEClass, First.class, "First", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFirst_Parent(), this.getRDFList(), this.getRDFList_First(), "parent", null, 1, 1, First.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getFirst_First(), theRdfsPackage.getRDFResource(), null, "first", null, 0, 1, First.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(seqEClass, Seq.class, "Seq", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(rdfObjectEClass, RDFObject.class, "RDFObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRDFObject_Statement(), this.getRDFStatement(), this.getRDFStatement_Object(), "statement", null, 1, 1, RDFObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(rdfuriEClass, org.w3.rdf.RDFURI.class, "RDFURI", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(rdfPropertyEClass, RDFProperty.class, "RDFProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRDFProperty_Domain(), theRdfsPackage.getDomain(), null, "domain", null, 1, 1, RDFProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRDFProperty_SubPropertyOf(), theRdfsPackage.getSubPropertyOf(), theRdfsPackage.getSubPropertyOf_Property(), "subPropertyOf", null, 1, 1, RDFProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRDFProperty_Range(), theRdfsPackage.getRange(), null, "range", null, 1, 1, RDFProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		// Initialize data types
		initEDataType(primitiveLiteralEDataType, String.class, "PrimitiveLiteral", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //RdfPackageImpl
