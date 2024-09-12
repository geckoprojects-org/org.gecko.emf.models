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
package org.w3._2005.atom.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.w3._2005.atom.AtomDocumentRoot;
import org.w3._2005.atom.AtomFactory;
import org.w3._2005.atom.AtomPackage;
import org.w3._2005.atom.AtomPersonConstruct;
import org.w3._2005.atom.LinkType;

import org.w3._2005.atom.util.AtomValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AtomPackageImpl extends EPackageImpl implements AtomPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass atomPersonConstructEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linkTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass atomDocumentRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType atomEmailAddressEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType atomLanguageTagEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType atomMediaTypeEDataType = null;

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
	 * @see org.w3._2005.atom.AtomPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AtomPackageImpl() {
		super(eNS_URI, AtomFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link AtomPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AtomPackage init() {
		if (isInited) return (AtomPackage)EPackage.Registry.INSTANCE.getEPackage(AtomPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredAtomPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		AtomPackageImpl theAtomPackage = registeredAtomPackage instanceof AtomPackageImpl ? (AtomPackageImpl)registeredAtomPackage : new AtomPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theAtomPackage.createPackageContents();

		// Initialize created meta-data
		theAtomPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theAtomPackage,
			 new EValidator.Descriptor() {
				 @Override
				 public EValidator getEValidator() {
					 return AtomValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theAtomPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AtomPackage.eNS_URI, theAtomPackage);
		return theAtomPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAtomPersonConstruct() {
		return atomPersonConstructEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAtomPersonConstruct_Group() {
		return (EAttribute)atomPersonConstructEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAtomPersonConstruct_Name() {
		return (EAttribute)atomPersonConstructEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAtomPersonConstruct_Uri() {
		return (EAttribute)atomPersonConstructEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAtomPersonConstruct_Email() {
		return (EAttribute)atomPersonConstructEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLinkType() {
		return linkTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLinkType_Href() {
		return (EAttribute)linkTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLinkType_Hreflang() {
		return (EAttribute)linkTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLinkType_Length() {
		return (EAttribute)linkTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLinkType_Rel() {
		return (EAttribute)linkTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLinkType_Title() {
		return (EAttribute)linkTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLinkType_Type() {
		return (EAttribute)linkTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAtomDocumentRoot() {
		return atomDocumentRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAtomDocumentRoot_Mixed() {
		return (EAttribute)atomDocumentRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAtomDocumentRoot_XMLNSPrefixMap() {
		return (EReference)atomDocumentRootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAtomDocumentRoot_XSISchemaLocation() {
		return (EReference)atomDocumentRootEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAtomDocumentRoot_Author() {
		return (EReference)atomDocumentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAtomDocumentRoot_Email() {
		return (EAttribute)atomDocumentRootEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAtomDocumentRoot_Link() {
		return (EReference)atomDocumentRootEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAtomDocumentRoot_Name() {
		return (EAttribute)atomDocumentRootEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAtomDocumentRoot_Uri() {
		return (EAttribute)atomDocumentRootEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getAtomEmailAddress() {
		return atomEmailAddressEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getAtomLanguageTag() {
		return atomLanguageTagEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getAtomMediaType() {
		return atomMediaTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AtomFactory getAtomFactory() {
		return (AtomFactory)getEFactoryInstance();
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
		atomPersonConstructEClass = createEClass(ATOM_PERSON_CONSTRUCT);
		createEAttribute(atomPersonConstructEClass, ATOM_PERSON_CONSTRUCT__GROUP);
		createEAttribute(atomPersonConstructEClass, ATOM_PERSON_CONSTRUCT__NAME);
		createEAttribute(atomPersonConstructEClass, ATOM_PERSON_CONSTRUCT__URI);
		createEAttribute(atomPersonConstructEClass, ATOM_PERSON_CONSTRUCT__EMAIL);

		linkTypeEClass = createEClass(LINK_TYPE);
		createEAttribute(linkTypeEClass, LINK_TYPE__HREF);
		createEAttribute(linkTypeEClass, LINK_TYPE__HREFLANG);
		createEAttribute(linkTypeEClass, LINK_TYPE__LENGTH);
		createEAttribute(linkTypeEClass, LINK_TYPE__REL);
		createEAttribute(linkTypeEClass, LINK_TYPE__TITLE);
		createEAttribute(linkTypeEClass, LINK_TYPE__TYPE);

		atomDocumentRootEClass = createEClass(ATOM_DOCUMENT_ROOT);
		createEAttribute(atomDocumentRootEClass, ATOM_DOCUMENT_ROOT__MIXED);
		createEReference(atomDocumentRootEClass, ATOM_DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(atomDocumentRootEClass, ATOM_DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(atomDocumentRootEClass, ATOM_DOCUMENT_ROOT__AUTHOR);
		createEAttribute(atomDocumentRootEClass, ATOM_DOCUMENT_ROOT__EMAIL);
		createEReference(atomDocumentRootEClass, ATOM_DOCUMENT_ROOT__LINK);
		createEAttribute(atomDocumentRootEClass, ATOM_DOCUMENT_ROOT__NAME);
		createEAttribute(atomDocumentRootEClass, ATOM_DOCUMENT_ROOT__URI);

		// Create data types
		atomEmailAddressEDataType = createEDataType(ATOM_EMAIL_ADDRESS);
		atomLanguageTagEDataType = createEDataType(ATOM_LANGUAGE_TAG);
		atomMediaTypeEDataType = createEDataType(ATOM_MEDIA_TYPE);
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
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(atomPersonConstructEClass, AtomPersonConstruct.class, "AtomPersonConstruct", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAtomPersonConstruct_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, AtomPersonConstruct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAtomPersonConstruct_Name(), theXMLTypePackage.getString(), "name", null, 0, -1, AtomPersonConstruct.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getAtomPersonConstruct_Uri(), theXMLTypePackage.getString(), "uri", null, 0, -1, AtomPersonConstruct.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getAtomPersonConstruct_Email(), this.getAtomEmailAddress(), "email", null, 0, -1, AtomPersonConstruct.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(linkTypeEClass, LinkType.class, "LinkType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLinkType_Href(), theXMLTypePackage.getAnySimpleType(), "href", null, 1, 1, LinkType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLinkType_Hreflang(), this.getAtomLanguageTag(), "hreflang", null, 0, 1, LinkType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLinkType_Length(), theXMLTypePackage.getAnySimpleType(), "length", null, 0, 1, LinkType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLinkType_Rel(), theXMLTypePackage.getAnySimpleType(), "rel", null, 0, 1, LinkType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLinkType_Title(), theXMLTypePackage.getAnySimpleType(), "title", null, 0, 1, LinkType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLinkType_Type(), this.getAtomMediaType(), "type", null, 0, 1, LinkType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(atomDocumentRootEClass, AtomDocumentRoot.class, "AtomDocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAtomDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAtomDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAtomDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAtomDocumentRoot_Author(), this.getAtomPersonConstruct(), null, "author", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getAtomDocumentRoot_Email(), this.getAtomEmailAddress(), "email", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getAtomDocumentRoot_Link(), this.getLinkType(), null, "link", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getAtomDocumentRoot_Name(), theXMLTypePackage.getString(), "name", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getAtomDocumentRoot_Uri(), theXMLTypePackage.getString(), "uri", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		// Initialize data types
		initEDataType(atomEmailAddressEDataType, String.class, "AtomEmailAddress", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(atomLanguageTagEDataType, String.class, "AtomLanguageTag", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(atomMediaTypeEDataType, String.class, "AtomMediaType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// null
		createNullAnnotations();
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>null</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createNullAnnotations() {
		String source = null;
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "appinfo", "atom-author-link.xsd 2008-01-23"
		   });
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";
		addAnnotation
		  (atomEmailAddressEDataType,
		   source,
		   new String[] {
			   "name", "atomEmailAddress",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
			   "pattern", ".+@.+"
		   });
		addAnnotation
		  (atomLanguageTagEDataType,
		   source,
		   new String[] {
			   "name", "atomLanguageTag",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
			   "pattern", "[A-Za-z]{1,8}(-[A-Za-z0-9]{1,8})*"
		   });
		addAnnotation
		  (atomMediaTypeEDataType,
		   source,
		   new String[] {
			   "name", "atomMediaType",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
			   "pattern", ".+/.+"
		   });
		addAnnotation
		  (atomPersonConstructEClass,
		   source,
		   new String[] {
			   "name", "atomPersonConstruct",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getAtomPersonConstruct_Group(),
		   source,
		   new String[] {
			   "kind", "group",
			   "name", "group:0"
		   });
		addAnnotation
		  (getAtomPersonConstruct_Name(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "name",
			   "namespace", "##targetNamespace",
			   "group", "#group:0"
		   });
		addAnnotation
		  (getAtomPersonConstruct_Uri(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "uri",
			   "namespace", "##targetNamespace",
			   "group", "#group:0"
		   });
		addAnnotation
		  (getAtomPersonConstruct_Email(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "email",
			   "namespace", "##targetNamespace",
			   "group", "#group:0"
		   });
		addAnnotation
		  (linkTypeEClass,
		   source,
		   new String[] {
			   "name", "link_._type",
			   "kind", "empty"
		   });
		addAnnotation
		  (getLinkType_Href(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "href"
		   });
		addAnnotation
		  (getLinkType_Hreflang(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "hreflang"
		   });
		addAnnotation
		  (getLinkType_Length(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "length"
		   });
		addAnnotation
		  (getLinkType_Rel(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "rel"
		   });
		addAnnotation
		  (getLinkType_Title(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "title"
		   });
		addAnnotation
		  (getLinkType_Type(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "type"
		   });
		addAnnotation
		  (atomDocumentRootEClass,
		   source,
		   new String[] {
			   "name", "",
			   "kind", "mixed"
		   });
		addAnnotation
		  (getAtomDocumentRoot_Mixed(),
		   source,
		   new String[] {
			   "kind", "elementWildcard",
			   "name", ":mixed"
		   });
		addAnnotation
		  (getAtomDocumentRoot_XMLNSPrefixMap(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "xmlns:prefix"
		   });
		addAnnotation
		  (getAtomDocumentRoot_XSISchemaLocation(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "xsi:schemaLocation"
		   });
		addAnnotation
		  (getAtomDocumentRoot_Author(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "author",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAtomDocumentRoot_Email(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "email",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAtomDocumentRoot_Link(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "link",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAtomDocumentRoot_Name(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "name",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAtomDocumentRoot_Uri(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "uri",
			   "namespace", "##targetNamespace"
		   });
	}

} //AtomPackageImpl
