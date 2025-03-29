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
package org.omg.spec.cmmn.cmmndi.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.omg.spec.cmmn.casemodel.CaseModelPackage;

import org.omg.spec.cmmn.casemodel.impl.CaseModelPackageImpl;

import org.omg.spec.cmmn.cmmndi.CMMNDIFactory;
import org.omg.spec.cmmn.cmmndi.CMMNDIPackage;
import org.omg.spec.cmmn.cmmndi.CMMNDIRoot;
import org.omg.spec.cmmn.cmmndi.CMMNDiagram;
import org.omg.spec.cmmn.cmmndi.CMMNEdge;
import org.omg.spec.cmmn.cmmndi.CMMNLabel;
import org.omg.spec.cmmn.cmmndi.CMMNShape;
import org.omg.spec.cmmn.cmmndi.CMMNStyle;

import org.omg.spec.cmmn.dc.DCPackage;

import org.omg.spec.cmmn.dc.impl.DCPackageImpl;

import org.omg.spec.cmmn.di.DIPackage;

import org.omg.spec.cmmn.di.impl.DIPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CMMNDIPackageImpl extends EPackageImpl implements CMMNDIPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cmmndiEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cmmnDiagramEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cmmnEdgeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cmmnLabelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cmmnShapeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cmmnStyleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cmmndiRootEClass = null;

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
	 * @see org.omg.spec.cmmn.cmmndi.CMMNDIPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CMMNDIPackageImpl() {
		super(eNS_URI, CMMNDIFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link CMMNDIPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CMMNDIPackage init() {
		if (isInited) return (CMMNDIPackage)EPackage.Registry.INSTANCE.getEPackage(CMMNDIPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredCMMNDIPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		CMMNDIPackageImpl theCMMNDIPackage = registeredCMMNDIPackage instanceof CMMNDIPackageImpl ? (CMMNDIPackageImpl)registeredCMMNDIPackage : new CMMNDIPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(CaseModelPackage.eNS_URI);
		CaseModelPackageImpl theCaseModelPackage = (CaseModelPackageImpl)(registeredPackage instanceof CaseModelPackageImpl ? registeredPackage : CaseModelPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(DCPackage.eNS_URI);
		DCPackageImpl theDCPackage = (DCPackageImpl)(registeredPackage instanceof DCPackageImpl ? registeredPackage : DCPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(DIPackage.eNS_URI);
		DIPackageImpl theDIPackage = (DIPackageImpl)(registeredPackage instanceof DIPackageImpl ? registeredPackage : DIPackage.eINSTANCE);

		// Create package meta-data objects
		theCMMNDIPackage.createPackageContents();
		theCaseModelPackage.createPackageContents();
		theDCPackage.createPackageContents();
		theDIPackage.createPackageContents();

		// Initialize created meta-data
		theCMMNDIPackage.initializePackageContents();
		theCaseModelPackage.initializePackageContents();
		theDCPackage.initializePackageContents();
		theDIPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCMMNDIPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CMMNDIPackage.eNS_URI, theCMMNDIPackage);
		return theCMMNDIPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCMMNDI() {
		return cmmndiEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCMMNDI_CMMNDiagram() {
		return (EReference)cmmndiEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCMMNDI_CMMNStyle() {
		return (EReference)cmmndiEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCMMNDiagram() {
		return cmmnDiagramEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCMMNDiagram_Size() {
		return (EReference)cmmnDiagramEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCMMNDiagram_CMMNDiagramElementGroup() {
		return (EAttribute)cmmnDiagramEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCMMNDiagram_CMMNDiagramElement() {
		return (EReference)cmmnDiagramEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCMMNDiagram_CmmnElementRef() {
		return (EAttribute)cmmnDiagramEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCMMNEdge() {
		return cmmnEdgeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCMMNEdge_CMMNLabel() {
		return (EReference)cmmnEdgeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCMMNEdge_CmmnElementRef() {
		return (EAttribute)cmmnEdgeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCMMNEdge_IsStandardEventVisible() {
		return (EAttribute)cmmnEdgeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCMMNEdge_SourceCMMNElementRef() {
		return (EAttribute)cmmnEdgeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCMMNEdge_TargetCMMNElementRef() {
		return (EAttribute)cmmnEdgeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCMMNLabel() {
		return cmmnLabelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCMMNShape() {
		return cmmnShapeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCMMNShape_CMMNLabel() {
		return (EReference)cmmnShapeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCMMNShape_CmmnElementRef() {
		return (EAttribute)cmmnShapeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCMMNShape_IsCollapsed() {
		return (EAttribute)cmmnShapeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCMMNShape_IsPlanningTableCollapsed() {
		return (EAttribute)cmmnShapeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCMMNStyle() {
		return cmmnStyleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCMMNStyle_FillColor() {
		return (EReference)cmmnStyleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCMMNStyle_StrokeColor() {
		return (EReference)cmmnStyleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCMMNStyle_FontColor() {
		return (EReference)cmmnStyleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCMMNStyle_FontBold() {
		return (EAttribute)cmmnStyleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCMMNStyle_FontFamily() {
		return (EAttribute)cmmnStyleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCMMNStyle_FontItalic() {
		return (EAttribute)cmmnStyleEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCMMNStyle_FontSize() {
		return (EAttribute)cmmnStyleEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCMMNStyle_FontStrikeThrough() {
		return (EAttribute)cmmnStyleEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCMMNStyle_FontUnderline() {
		return (EAttribute)cmmnStyleEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCMMNStyle_LabelHorizontalAlignement() {
		return (EAttribute)cmmnStyleEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCMMNStyle_LabelVerticalAlignment() {
		return (EAttribute)cmmnStyleEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCMMNDIRoot() {
		return cmmndiRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCMMNDIRoot_Mixed() {
		return (EAttribute)cmmndiRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCMMNDIRoot_XMLNSPrefixMap() {
		return (EReference)cmmndiRootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCMMNDIRoot_XSISchemaLocation() {
		return (EReference)cmmndiRootEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCMMNDIRoot_CMMNDI() {
		return (EReference)cmmndiRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCMMNDIRoot_CMMNDiagram() {
		return (EReference)cmmndiRootEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCMMNDIRoot_CMMNDiagramElement() {
		return (EReference)cmmndiRootEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCMMNDIRoot_CMMNEdge() {
		return (EReference)cmmndiRootEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCMMNDIRoot_CMMNLabel() {
		return (EReference)cmmndiRootEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCMMNDIRoot_CMMNShape() {
		return (EReference)cmmndiRootEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCMMNDIRoot_CMMNStyle() {
		return (EReference)cmmndiRootEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CMMNDIFactory getCMMNDIFactory() {
		return (CMMNDIFactory)getEFactoryInstance();
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
		cmmndiEClass = createEClass(CMMNDI);
		createEReference(cmmndiEClass, CMMNDI__CMMN_DIAGRAM);
		createEReference(cmmndiEClass, CMMNDI__CMMN_STYLE);

		cmmnDiagramEClass = createEClass(CMMN_DIAGRAM);
		createEReference(cmmnDiagramEClass, CMMN_DIAGRAM__SIZE);
		createEAttribute(cmmnDiagramEClass, CMMN_DIAGRAM__CMMN_DIAGRAM_ELEMENT_GROUP);
		createEReference(cmmnDiagramEClass, CMMN_DIAGRAM__CMMN_DIAGRAM_ELEMENT);
		createEAttribute(cmmnDiagramEClass, CMMN_DIAGRAM__CMMN_ELEMENT_REF);

		cmmnEdgeEClass = createEClass(CMMN_EDGE);
		createEReference(cmmnEdgeEClass, CMMN_EDGE__CMMN_LABEL);
		createEAttribute(cmmnEdgeEClass, CMMN_EDGE__CMMN_ELEMENT_REF);
		createEAttribute(cmmnEdgeEClass, CMMN_EDGE__IS_STANDARD_EVENT_VISIBLE);
		createEAttribute(cmmnEdgeEClass, CMMN_EDGE__SOURCE_CMMN_ELEMENT_REF);
		createEAttribute(cmmnEdgeEClass, CMMN_EDGE__TARGET_CMMN_ELEMENT_REF);

		cmmnLabelEClass = createEClass(CMMN_LABEL);

		cmmnShapeEClass = createEClass(CMMN_SHAPE);
		createEReference(cmmnShapeEClass, CMMN_SHAPE__CMMN_LABEL);
		createEAttribute(cmmnShapeEClass, CMMN_SHAPE__CMMN_ELEMENT_REF);
		createEAttribute(cmmnShapeEClass, CMMN_SHAPE__IS_COLLAPSED);
		createEAttribute(cmmnShapeEClass, CMMN_SHAPE__IS_PLANNING_TABLE_COLLAPSED);

		cmmnStyleEClass = createEClass(CMMN_STYLE);
		createEReference(cmmnStyleEClass, CMMN_STYLE__FILL_COLOR);
		createEReference(cmmnStyleEClass, CMMN_STYLE__STROKE_COLOR);
		createEReference(cmmnStyleEClass, CMMN_STYLE__FONT_COLOR);
		createEAttribute(cmmnStyleEClass, CMMN_STYLE__FONT_BOLD);
		createEAttribute(cmmnStyleEClass, CMMN_STYLE__FONT_FAMILY);
		createEAttribute(cmmnStyleEClass, CMMN_STYLE__FONT_ITALIC);
		createEAttribute(cmmnStyleEClass, CMMN_STYLE__FONT_SIZE);
		createEAttribute(cmmnStyleEClass, CMMN_STYLE__FONT_STRIKE_THROUGH);
		createEAttribute(cmmnStyleEClass, CMMN_STYLE__FONT_UNDERLINE);
		createEAttribute(cmmnStyleEClass, CMMN_STYLE__LABEL_HORIZONTAL_ALIGNEMENT);
		createEAttribute(cmmnStyleEClass, CMMN_STYLE__LABEL_VERTICAL_ALIGNMENT);

		cmmndiRootEClass = createEClass(CMMNDI_ROOT);
		createEAttribute(cmmndiRootEClass, CMMNDI_ROOT__MIXED);
		createEReference(cmmndiRootEClass, CMMNDI_ROOT__XMLNS_PREFIX_MAP);
		createEReference(cmmndiRootEClass, CMMNDI_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(cmmndiRootEClass, CMMNDI_ROOT__CMMNDI);
		createEReference(cmmndiRootEClass, CMMNDI_ROOT__CMMN_DIAGRAM);
		createEReference(cmmndiRootEClass, CMMNDI_ROOT__CMMN_DIAGRAM_ELEMENT);
		createEReference(cmmndiRootEClass, CMMNDI_ROOT__CMMN_EDGE);
		createEReference(cmmndiRootEClass, CMMNDI_ROOT__CMMN_LABEL);
		createEReference(cmmndiRootEClass, CMMNDI_ROOT__CMMN_SHAPE);
		createEReference(cmmndiRootEClass, CMMNDI_ROOT__CMMN_STYLE);
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
		DIPackage theDIPackage = (DIPackage)EPackage.Registry.INSTANCE.getEPackage(DIPackage.eNS_URI);
		DCPackage theDCPackage = (DCPackage)EPackage.Registry.INSTANCE.getEPackage(DCPackage.eNS_URI);
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		cmmnDiagramEClass.getESuperTypes().add(theDIPackage.getDiagram());
		cmmnEdgeEClass.getESuperTypes().add(theDIPackage.getEdge());
		cmmnLabelEClass.getESuperTypes().add(theDIPackage.getShape());
		cmmnShapeEClass.getESuperTypes().add(theDIPackage.getShape());
		cmmnStyleEClass.getESuperTypes().add(theDIPackage.getStyle());

		// Initialize classes, features, and operations; add parameters
		initEClass(cmmndiEClass, org.omg.spec.cmmn.cmmndi.CMMNDI.class, "CMMNDI", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCMMNDI_CMMNDiagram(), this.getCMMNDiagram(), null, "cMMNDiagram", null, 0, -1, org.omg.spec.cmmn.cmmndi.CMMNDI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCMMNDI_CMMNStyle(), this.getCMMNStyle(), null, "cMMNStyle", null, 0, -1, org.omg.spec.cmmn.cmmndi.CMMNDI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cmmnDiagramEClass, CMMNDiagram.class, "CMMNDiagram", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCMMNDiagram_Size(), theDCPackage.getDimension(), null, "size", null, 0, 1, CMMNDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCMMNDiagram_CMMNDiagramElementGroup(), ecorePackage.getEFeatureMapEntry(), "cMMNDiagramElementGroup", null, 0, -1, CMMNDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCMMNDiagram_CMMNDiagramElement(), theDIPackage.getDiagramElement(), null, "cMMNDiagramElement", null, 0, -1, CMMNDiagram.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getCMMNDiagram_CmmnElementRef(), theXMLTypePackage.getQName(), "cmmnElementRef", null, 0, 1, CMMNDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cmmnEdgeEClass, CMMNEdge.class, "CMMNEdge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCMMNEdge_CMMNLabel(), this.getCMMNLabel(), null, "cMMNLabel", null, 1, 1, CMMNEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCMMNEdge_CmmnElementRef(), theXMLTypePackage.getQName(), "cmmnElementRef", null, 0, 1, CMMNEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCMMNEdge_IsStandardEventVisible(), theXMLTypePackage.getBoolean(), "isStandardEventVisible", null, 0, 1, CMMNEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCMMNEdge_SourceCMMNElementRef(), theXMLTypePackage.getQName(), "sourceCMMNElementRef", null, 0, 1, CMMNEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCMMNEdge_TargetCMMNElementRef(), theXMLTypePackage.getQName(), "targetCMMNElementRef", null, 0, 1, CMMNEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cmmnLabelEClass, CMMNLabel.class, "CMMNLabel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(cmmnShapeEClass, CMMNShape.class, "CMMNShape", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCMMNShape_CMMNLabel(), this.getCMMNLabel(), null, "cMMNLabel", null, 1, 1, CMMNShape.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCMMNShape_CmmnElementRef(), theXMLTypePackage.getQName(), "cmmnElementRef", null, 1, 1, CMMNShape.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCMMNShape_IsCollapsed(), theXMLTypePackage.getBoolean(), "isCollapsed", null, 0, 1, CMMNShape.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCMMNShape_IsPlanningTableCollapsed(), theXMLTypePackage.getBoolean(), "isPlanningTableCollapsed", null, 0, 1, CMMNShape.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cmmnStyleEClass, CMMNStyle.class, "CMMNStyle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCMMNStyle_FillColor(), theDCPackage.getColor(), null, "fillColor", null, 0, 1, CMMNStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCMMNStyle_StrokeColor(), theDCPackage.getColor(), null, "strokeColor", null, 0, 1, CMMNStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCMMNStyle_FontColor(), theDCPackage.getColor(), null, "fontColor", null, 0, 1, CMMNStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCMMNStyle_FontBold(), theXMLTypePackage.getBoolean(), "fontBold", null, 0, 1, CMMNStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCMMNStyle_FontFamily(), theXMLTypePackage.getString(), "fontFamily", null, 0, 1, CMMNStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCMMNStyle_FontItalic(), theXMLTypePackage.getBoolean(), "fontItalic", null, 0, 1, CMMNStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCMMNStyle_FontSize(), theXMLTypePackage.getDouble(), "fontSize", null, 0, 1, CMMNStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCMMNStyle_FontStrikeThrough(), theXMLTypePackage.getBoolean(), "fontStrikeThrough", null, 0, 1, CMMNStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCMMNStyle_FontUnderline(), theXMLTypePackage.getBoolean(), "fontUnderline", null, 0, 1, CMMNStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCMMNStyle_LabelHorizontalAlignement(), theDCPackage.getAlignmentKind(), "labelHorizontalAlignement", null, 0, 1, CMMNStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCMMNStyle_LabelVerticalAlignment(), theDCPackage.getAlignmentKind(), "labelVerticalAlignment", null, 0, 1, CMMNStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cmmndiRootEClass, CMMNDIRoot.class, "CMMNDIRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCMMNDIRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCMMNDIRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCMMNDIRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCMMNDIRoot_CMMNDI(), this.getCMMNDI(), null, "cMMNDI", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getCMMNDIRoot_CMMNDiagram(), this.getCMMNDiagram(), null, "cMMNDiagram", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getCMMNDIRoot_CMMNDiagramElement(), theDIPackage.getDiagramElement(), null, "cMMNDiagramElement", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getCMMNDIRoot_CMMNEdge(), this.getCMMNEdge(), null, "cMMNEdge", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getCMMNDIRoot_CMMNLabel(), this.getCMMNLabel(), null, "cMMNLabel", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getCMMNDIRoot_CMMNShape(), this.getCMMNShape(), null, "cMMNShape", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getCMMNDIRoot_CMMNStyle(), this.getCMMNStyle(), null, "cMMNStyle", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

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
		  (cmmndiEClass,
		   source,
		   new String[] {
			   "name", "CMMNDI",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getCMMNDI_CMMNDiagram(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "CMMNDiagram",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getCMMNDI_CMMNStyle(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "CMMNStyle",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (cmmnDiagramEClass,
		   source,
		   new String[] {
			   "name", "CMMNDiagram",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getCMMNDiagram_Size(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Size",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getCMMNDiagram_CMMNDiagramElementGroup(),
		   source,
		   new String[] {
			   "kind", "group",
			   "name", "CMMNDiagramElement:group",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getCMMNDiagram_CMMNDiagramElement(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "CMMNDiagramElement",
			   "namespace", "##targetNamespace",
			   "group", "CMMNDiagramElement:group"
		   });
		addAnnotation
		  (getCMMNDiagram_CmmnElementRef(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "cmmnElementRef"
		   });
		addAnnotation
		  (cmmnEdgeEClass,
		   source,
		   new String[] {
			   "name", "CMMNEdge",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getCMMNEdge_CMMNLabel(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "CMMNLabel",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getCMMNEdge_CmmnElementRef(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "cmmnElementRef"
		   });
		addAnnotation
		  (getCMMNEdge_IsStandardEventVisible(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "isStandardEventVisible"
		   });
		addAnnotation
		  (getCMMNEdge_SourceCMMNElementRef(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "sourceCMMNElementRef"
		   });
		addAnnotation
		  (getCMMNEdge_TargetCMMNElementRef(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "targetCMMNElementRef"
		   });
		addAnnotation
		  (cmmnLabelEClass,
		   source,
		   new String[] {
			   "name", "CMMNLabel",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (cmmnShapeEClass,
		   source,
		   new String[] {
			   "name", "CMMNShape",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getCMMNShape_CMMNLabel(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "CMMNLabel",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getCMMNShape_CmmnElementRef(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "cmmnElementRef"
		   });
		addAnnotation
		  (getCMMNShape_IsCollapsed(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "isCollapsed"
		   });
		addAnnotation
		  (getCMMNShape_IsPlanningTableCollapsed(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "isPlanningTableCollapsed"
		   });
		addAnnotation
		  (cmmnStyleEClass,
		   source,
		   new String[] {
			   "name", "CMMNStyle",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getCMMNStyle_FillColor(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "FillColor",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getCMMNStyle_StrokeColor(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "StrokeColor",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getCMMNStyle_FontColor(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "FontColor",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getCMMNStyle_FontBold(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "fontBold"
		   });
		addAnnotation
		  (getCMMNStyle_FontFamily(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "fontFamily"
		   });
		addAnnotation
		  (getCMMNStyle_FontItalic(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "fontItalic"
		   });
		addAnnotation
		  (getCMMNStyle_FontSize(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "fontSize"
		   });
		addAnnotation
		  (getCMMNStyle_FontStrikeThrough(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "fontStrikeThrough"
		   });
		addAnnotation
		  (getCMMNStyle_FontUnderline(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "fontUnderline"
		   });
		addAnnotation
		  (getCMMNStyle_LabelHorizontalAlignement(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "labelHorizontalAlignement"
		   });
		addAnnotation
		  (getCMMNStyle_LabelVerticalAlignment(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "labelVerticalAlignment"
		   });
		addAnnotation
		  (cmmndiRootEClass,
		   source,
		   new String[] {
			   "name", "",
			   "kind", "mixed"
		   });
		addAnnotation
		  (getCMMNDIRoot_Mixed(),
		   source,
		   new String[] {
			   "kind", "elementWildcard",
			   "name", ":mixed"
		   });
		addAnnotation
		  (getCMMNDIRoot_XMLNSPrefixMap(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "xmlns:prefix"
		   });
		addAnnotation
		  (getCMMNDIRoot_XSISchemaLocation(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "xsi:schemaLocation"
		   });
		addAnnotation
		  (getCMMNDIRoot_CMMNDI(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "CMMNDI",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getCMMNDIRoot_CMMNDiagram(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "CMMNDiagram",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getCMMNDIRoot_CMMNDiagramElement(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "CMMNDiagramElement",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getCMMNDIRoot_CMMNEdge(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "CMMNEdge",
			   "namespace", "##targetNamespace",
			   "affiliation", "CMMNDiagramElement"
		   });
		addAnnotation
		  (getCMMNDIRoot_CMMNLabel(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "CMMNLabel",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getCMMNDIRoot_CMMNShape(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "CMMNShape",
			   "namespace", "##targetNamespace",
			   "affiliation", "CMMNDiagramElement"
		   });
		addAnnotation
		  (getCMMNDIRoot_CMMNStyle(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "CMMNStyle",
			   "namespace", "##targetNamespace",
			   "affiliation", "http://www.omg.org/spec/CMMN/20151109/DI#Style"
		   });
	}

} //CMMNDIPackageImpl
