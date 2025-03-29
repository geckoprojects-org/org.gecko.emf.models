/**
 * Copyright (c) 2012 - 2025 Data In Motion and others.
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
package org.omg.spec.cmmn.dc.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.omg.spec.cmmn.casemodel.CaseModelPackage;

import org.omg.spec.cmmn.casemodel.impl.CaseModelPackageImpl;

import org.omg.spec.cmmn.cmmndi.CMMNDIPackage;

import org.omg.spec.cmmn.cmmndi.impl.CMMNDIPackageImpl;

import org.omg.spec.cmmn.dc.AlignmentKind;
import org.omg.spec.cmmn.dc.Bounds;
import org.omg.spec.cmmn.dc.Color;
import org.omg.spec.cmmn.dc.DCFactory;
import org.omg.spec.cmmn.dc.DCPackage;
import org.omg.spec.cmmn.dc.DCRoot;
import org.omg.spec.cmmn.dc.Dimension;
import org.omg.spec.cmmn.dc.KnownColor;
import org.omg.spec.cmmn.dc.Point;

import org.omg.spec.cmmn.dc.util.DCValidator;

import org.omg.spec.cmmn.di.DIPackage;

import org.omg.spec.cmmn.di.impl.DIPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DCPackageImpl extends EPackageImpl implements DCPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass boundsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass colorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dimensionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dcRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum alignmentKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum knownColorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType alignmentKindObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType knownColorObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType rgbEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType rgbObjectEDataType = null;

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
	 * @see org.omg.spec.cmmn.dc.DCPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DCPackageImpl() {
		super(eNS_URI, DCFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link DCPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DCPackage init() {
		if (isInited) return (DCPackage)EPackage.Registry.INSTANCE.getEPackage(DCPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredDCPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		DCPackageImpl theDCPackage = registeredDCPackage instanceof DCPackageImpl ? (DCPackageImpl)registeredDCPackage : new DCPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(CaseModelPackage.eNS_URI);
		CaseModelPackageImpl theCaseModelPackage = (CaseModelPackageImpl)(registeredPackage instanceof CaseModelPackageImpl ? registeredPackage : CaseModelPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(CMMNDIPackage.eNS_URI);
		CMMNDIPackageImpl theCMMNDIPackage = (CMMNDIPackageImpl)(registeredPackage instanceof CMMNDIPackageImpl ? registeredPackage : CMMNDIPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(DIPackage.eNS_URI);
		DIPackageImpl theDIPackage = (DIPackageImpl)(registeredPackage instanceof DIPackageImpl ? registeredPackage : DIPackage.eINSTANCE);

		// Create package meta-data objects
		theDCPackage.createPackageContents();
		theCaseModelPackage.createPackageContents();
		theCMMNDIPackage.createPackageContents();
		theDIPackage.createPackageContents();

		// Initialize created meta-data
		theDCPackage.initializePackageContents();
		theCaseModelPackage.initializePackageContents();
		theCMMNDIPackage.initializePackageContents();
		theDIPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theDCPackage,
			 new EValidator.Descriptor() {
				 @Override
				 public EValidator getEValidator() {
					 return DCValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theDCPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DCPackage.eNS_URI, theDCPackage);
		return theDCPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBounds() {
		return boundsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBounds_Height() {
		return (EAttribute)boundsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBounds_Width() {
		return (EAttribute)boundsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBounds_X() {
		return (EAttribute)boundsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBounds_Y() {
		return (EAttribute)boundsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getColor() {
		return colorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getColor_Blue() {
		return (EAttribute)colorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getColor_Green() {
		return (EAttribute)colorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getColor_Red() {
		return (EAttribute)colorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDimension() {
		return dimensionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDimension_Height() {
		return (EAttribute)dimensionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDimension_Width() {
		return (EAttribute)dimensionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDCRoot() {
		return dcRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDCRoot_Mixed() {
		return (EAttribute)dcRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDCRoot_XMLNSPrefixMap() {
		return (EReference)dcRootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDCRoot_XSISchemaLocation() {
		return (EReference)dcRootEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDCRoot_Bounds() {
		return (EReference)dcRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDCRoot_Color() {
		return (EReference)dcRootEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDCRoot_Dimension() {
		return (EReference)dcRootEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDCRoot_Point() {
		return (EReference)dcRootEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPoint() {
		return pointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPoint_X() {
		return (EAttribute)pointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPoint_Y() {
		return (EAttribute)pointEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getAlignmentKind() {
		return alignmentKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getKnownColor() {
		return knownColorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getAlignmentKindObject() {
		return alignmentKindObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getKnownColorObject() {
		return knownColorObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getRgb() {
		return rgbEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getRgbObject() {
		return rgbObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DCFactory getDCFactory() {
		return (DCFactory)getEFactoryInstance();
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
		boundsEClass = createEClass(BOUNDS);
		createEAttribute(boundsEClass, BOUNDS__HEIGHT);
		createEAttribute(boundsEClass, BOUNDS__WIDTH);
		createEAttribute(boundsEClass, BOUNDS__X);
		createEAttribute(boundsEClass, BOUNDS__Y);

		colorEClass = createEClass(COLOR);
		createEAttribute(colorEClass, COLOR__BLUE);
		createEAttribute(colorEClass, COLOR__GREEN);
		createEAttribute(colorEClass, COLOR__RED);

		dimensionEClass = createEClass(DIMENSION);
		createEAttribute(dimensionEClass, DIMENSION__HEIGHT);
		createEAttribute(dimensionEClass, DIMENSION__WIDTH);

		dcRootEClass = createEClass(DC_ROOT);
		createEAttribute(dcRootEClass, DC_ROOT__MIXED);
		createEReference(dcRootEClass, DC_ROOT__XMLNS_PREFIX_MAP);
		createEReference(dcRootEClass, DC_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(dcRootEClass, DC_ROOT__BOUNDS);
		createEReference(dcRootEClass, DC_ROOT__COLOR);
		createEReference(dcRootEClass, DC_ROOT__DIMENSION);
		createEReference(dcRootEClass, DC_ROOT__POINT);

		pointEClass = createEClass(POINT);
		createEAttribute(pointEClass, POINT__X);
		createEAttribute(pointEClass, POINT__Y);

		// Create enums
		alignmentKindEEnum = createEEnum(ALIGNMENT_KIND);
		knownColorEEnum = createEEnum(KNOWN_COLOR);

		// Create data types
		alignmentKindObjectEDataType = createEDataType(ALIGNMENT_KIND_OBJECT);
		knownColorObjectEDataType = createEDataType(KNOWN_COLOR_OBJECT);
		rgbEDataType = createEDataType(RGB);
		rgbObjectEDataType = createEDataType(RGB_OBJECT);
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
		initEClass(boundsEClass, Bounds.class, "Bounds", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBounds_Height(), theXMLTypePackage.getDouble(), "height", null, 1, 1, Bounds.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBounds_Width(), theXMLTypePackage.getDouble(), "width", null, 1, 1, Bounds.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBounds_X(), theXMLTypePackage.getDouble(), "x", null, 1, 1, Bounds.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBounds_Y(), theXMLTypePackage.getDouble(), "y", null, 1, 1, Bounds.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(colorEClass, Color.class, "Color", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getColor_Blue(), this.getRgb(), "blue", null, 1, 1, Color.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColor_Green(), this.getRgb(), "green", null, 1, 1, Color.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColor_Red(), this.getRgb(), "red", null, 1, 1, Color.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dimensionEClass, Dimension.class, "Dimension", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDimension_Height(), theXMLTypePackage.getDouble(), "height", null, 1, 1, Dimension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDimension_Width(), theXMLTypePackage.getDouble(), "width", null, 1, 1, Dimension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dcRootEClass, DCRoot.class, "DCRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDCRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDCRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDCRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDCRoot_Bounds(), this.getBounds(), null, "bounds", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDCRoot_Color(), this.getColor(), null, "color", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDCRoot_Dimension(), this.getDimension(), null, "dimension", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDCRoot_Point(), this.getPoint(), null, "point", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(pointEClass, Point.class, "Point", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPoint_X(), theXMLTypePackage.getDouble(), "x", null, 1, 1, Point.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPoint_Y(), theXMLTypePackage.getDouble(), "y", null, 1, 1, Point.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(alignmentKindEEnum, AlignmentKind.class, "AlignmentKind");
		addEEnumLiteral(alignmentKindEEnum, AlignmentKind.START);
		addEEnumLiteral(alignmentKindEEnum, AlignmentKind.END);
		addEEnumLiteral(alignmentKindEEnum, AlignmentKind.CENTER);

		initEEnum(knownColorEEnum, KnownColor.class, "KnownColor");
		addEEnumLiteral(knownColorEEnum, KnownColor.MAROON);
		addEEnumLiteral(knownColorEEnum, KnownColor.RED);
		addEEnumLiteral(knownColorEEnum, KnownColor.ORANGE);
		addEEnumLiteral(knownColorEEnum, KnownColor.YELLOW);
		addEEnumLiteral(knownColorEEnum, KnownColor.OLIVE);
		addEEnumLiteral(knownColorEEnum, KnownColor.PURPLE);
		addEEnumLiteral(knownColorEEnum, KnownColor.FUCHSIA);
		addEEnumLiteral(knownColorEEnum, KnownColor.WHITE);
		addEEnumLiteral(knownColorEEnum, KnownColor.LIME);
		addEEnumLiteral(knownColorEEnum, KnownColor.GREEN);
		addEEnumLiteral(knownColorEEnum, KnownColor.NAVY);
		addEEnumLiteral(knownColorEEnum, KnownColor.BLUE);
		addEEnumLiteral(knownColorEEnum, KnownColor.AQUA);
		addEEnumLiteral(knownColorEEnum, KnownColor.TEAL);
		addEEnumLiteral(knownColorEEnum, KnownColor.BLACK);
		addEEnumLiteral(knownColorEEnum, KnownColor.SILVER);
		addEEnumLiteral(knownColorEEnum, KnownColor.GRAY);

		// Initialize data types
		initEDataType(alignmentKindObjectEDataType, AlignmentKind.class, "AlignmentKindObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(knownColorObjectEDataType, KnownColor.class, "KnownColorObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(rgbEDataType, int.class, "Rgb", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(rgbObjectEDataType, Integer.class, "RgbObject", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
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
		  (alignmentKindEEnum,
		   source,
		   new String[] {
			   "name", "AlignmentKind"
		   });
		addAnnotation
		  (alignmentKindObjectEDataType,
		   source,
		   new String[] {
			   "name", "AlignmentKind:Object",
			   "baseType", "AlignmentKind"
		   });
		addAnnotation
		  (boundsEClass,
		   source,
		   new String[] {
			   "name", "Bounds",
			   "kind", "empty"
		   });
		addAnnotation
		  (getBounds_Height(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "height"
		   });
		addAnnotation
		  (getBounds_Width(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "width"
		   });
		addAnnotation
		  (getBounds_X(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "x"
		   });
		addAnnotation
		  (getBounds_Y(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "y"
		   });
		addAnnotation
		  (colorEClass,
		   source,
		   new String[] {
			   "name", "Color",
			   "kind", "empty"
		   });
		addAnnotation
		  (getColor_Blue(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "blue"
		   });
		addAnnotation
		  (getColor_Green(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "green"
		   });
		addAnnotation
		  (getColor_Red(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "red"
		   });
		addAnnotation
		  (dimensionEClass,
		   source,
		   new String[] {
			   "name", "Dimension",
			   "kind", "empty"
		   });
		addAnnotation
		  (getDimension_Height(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "height"
		   });
		addAnnotation
		  (getDimension_Width(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "width"
		   });
		addAnnotation
		  (dcRootEClass,
		   source,
		   new String[] {
			   "name", "",
			   "kind", "mixed"
		   });
		addAnnotation
		  (getDCRoot_Mixed(),
		   source,
		   new String[] {
			   "kind", "elementWildcard",
			   "name", ":mixed"
		   });
		addAnnotation
		  (getDCRoot_XMLNSPrefixMap(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "xmlns:prefix"
		   });
		addAnnotation
		  (getDCRoot_XSISchemaLocation(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "xsi:schemaLocation"
		   });
		addAnnotation
		  (getDCRoot_Bounds(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Bounds",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDCRoot_Color(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Color",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDCRoot_Dimension(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Dimension",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDCRoot_Point(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Point",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (knownColorEEnum,
		   source,
		   new String[] {
			   "name", "KnownColor"
		   });
		addAnnotation
		  (knownColorObjectEDataType,
		   source,
		   new String[] {
			   "name", "KnownColor:Object",
			   "baseType", "KnownColor"
		   });
		addAnnotation
		  (pointEClass,
		   source,
		   new String[] {
			   "name", "Point",
			   "kind", "empty"
		   });
		addAnnotation
		  (getPoint_X(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "x"
		   });
		addAnnotation
		  (getPoint_Y(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "y"
		   });
		addAnnotation
		  (rgbEDataType,
		   source,
		   new String[] {
			   "name", "rgb",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#int",
			   "minInclusive", "0",
			   "maxInclusive", "255"
		   });
		addAnnotation
		  (rgbObjectEDataType,
		   source,
		   new String[] {
			   "name", "rgb:Object",
			   "baseType", "rgb"
		   });
	}

} //DCPackageImpl
