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
package org.omg.spec.dmn.dmndi.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.omg.spec.dmn.dc.DCPackage;

import org.omg.spec.dmn.dc.impl.DCPackageImpl;

import org.omg.spec.dmn.di.DIPackage;

import org.omg.spec.dmn.di.impl.DIPackageImpl;

import org.omg.spec.dmn.dmn.DMNPackage;

import org.omg.spec.dmn.dmn.impl.DMNPackageImpl;

import org.omg.spec.dmn.dmndi.DMNDIFactory;
import org.omg.spec.dmn.dmndi.DMNDIPackage;
import org.omg.spec.dmn.dmndi.DMNDIRoot;
import org.omg.spec.dmn.dmndi.DMNDecisionServiceDividerLine;
import org.omg.spec.dmn.dmndi.DMNDiagram;
import org.omg.spec.dmn.dmndi.DMNEdge;
import org.omg.spec.dmn.dmndi.DMNLabel;
import org.omg.spec.dmn.dmndi.DMNShape;
import org.omg.spec.dmn.dmndi.DMNStyle;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DMNDIPackageImpl extends EPackageImpl implements DMNDIPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dmnDecisionServiceDividerLineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dmndiEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dmnDiagramEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dmnEdgeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dmnLabelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dmnShapeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dmnStyleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dmndiRootEClass = null;

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
	 * @see org.omg.spec.dmn.dmndi.DMNDIPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DMNDIPackageImpl() {
		super(eNS_URI, DMNDIFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link DMNDIPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DMNDIPackage init() {
		if (isInited) return (DMNDIPackage)EPackage.Registry.INSTANCE.getEPackage(DMNDIPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredDMNDIPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		DMNDIPackageImpl theDMNDIPackage = registeredDMNDIPackage instanceof DMNDIPackageImpl ? (DMNDIPackageImpl)registeredDMNDIPackage : new DMNDIPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(DMNPackage.eNS_URI);
		DMNPackageImpl theDMNPackage = (DMNPackageImpl)(registeredPackage instanceof DMNPackageImpl ? registeredPackage : DMNPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(DCPackage.eNS_URI);
		DCPackageImpl theDCPackage = (DCPackageImpl)(registeredPackage instanceof DCPackageImpl ? registeredPackage : DCPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(DIPackage.eNS_URI);
		DIPackageImpl theDIPackage = (DIPackageImpl)(registeredPackage instanceof DIPackageImpl ? registeredPackage : DIPackage.eINSTANCE);

		// Create package meta-data objects
		theDMNDIPackage.createPackageContents();
		theDMNPackage.createPackageContents();
		theDCPackage.createPackageContents();
		theDIPackage.createPackageContents();

		// Initialize created meta-data
		theDMNDIPackage.initializePackageContents();
		theDMNPackage.initializePackageContents();
		theDCPackage.initializePackageContents();
		theDIPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDMNDIPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DMNDIPackage.eNS_URI, theDMNDIPackage);
		return theDMNDIPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDMNDecisionServiceDividerLine() {
		return dmnDecisionServiceDividerLineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDMNDI() {
		return dmndiEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDMNDI_DMNDiagram() {
		return (EReference)dmndiEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDMNDI_DMNStyle() {
		return (EReference)dmndiEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDMNDiagram() {
		return dmnDiagramEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDMNDiagram_Size() {
		return (EReference)dmnDiagramEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDMNDiagram_DMNDiagramElementGroup() {
		return (EAttribute)dmnDiagramEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDMNDiagram_DMNDiagramElement() {
		return (EReference)dmnDiagramEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDMNDiagram_UseAlternativeInputDataShape() {
		return (EAttribute)dmnDiagramEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDMNEdge() {
		return dmnEdgeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDMNEdge_DMNLabel() {
		return (EReference)dmnEdgeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDMNEdge_DmnElementRef() {
		return (EAttribute)dmnEdgeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDMNEdge_SourceElement() {
		return (EAttribute)dmnEdgeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDMNEdge_TargetElement() {
		return (EAttribute)dmnEdgeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDMNLabel() {
		return dmnLabelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDMNLabel_Text() {
		return (EAttribute)dmnLabelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDMNShape() {
		return dmnShapeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDMNShape_DMNLabel() {
		return (EReference)dmnShapeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDMNShape_DMNDecisionServiceDividerLine() {
		return (EReference)dmnShapeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDMNShape_DmnElementRef() {
		return (EAttribute)dmnShapeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDMNShape_IsCollapsed() {
		return (EAttribute)dmnShapeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDMNShape_IsListedInputData() {
		return (EAttribute)dmnShapeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDMNStyle() {
		return dmnStyleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDMNStyle_FillColor() {
		return (EReference)dmnStyleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDMNStyle_StrokeColor() {
		return (EReference)dmnStyleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDMNStyle_FontColor() {
		return (EReference)dmnStyleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDMNStyle_FontBold() {
		return (EAttribute)dmnStyleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDMNStyle_FontFamily() {
		return (EAttribute)dmnStyleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDMNStyle_FontItalic() {
		return (EAttribute)dmnStyleEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDMNStyle_FontSize() {
		return (EAttribute)dmnStyleEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDMNStyle_FontStrikeThrough() {
		return (EAttribute)dmnStyleEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDMNStyle_FontUnderline() {
		return (EAttribute)dmnStyleEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDMNStyle_LabelHorizontalAlignement() {
		return (EAttribute)dmnStyleEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDMNStyle_LabelVerticalAlignment() {
		return (EAttribute)dmnStyleEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDMNDIRoot() {
		return dmndiRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDMNDIRoot_Mixed() {
		return (EAttribute)dmndiRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDMNDIRoot_XMLNSPrefixMap() {
		return (EReference)dmndiRootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDMNDIRoot_XSISchemaLocation() {
		return (EReference)dmndiRootEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDMNDIRoot_DMNDecisionServiceDividerLine() {
		return (EReference)dmndiRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDMNDIRoot_DMNDI() {
		return (EReference)dmndiRootEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDMNDIRoot_DMNDiagram() {
		return (EReference)dmndiRootEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDMNDIRoot_DMNDiagramElement() {
		return (EReference)dmndiRootEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDMNDIRoot_DMNEdge() {
		return (EReference)dmndiRootEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDMNDIRoot_DMNLabel() {
		return (EReference)dmndiRootEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDMNDIRoot_DMNShape() {
		return (EReference)dmndiRootEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDMNDIRoot_DMNStyle() {
		return (EReference)dmndiRootEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DMNDIFactory getDMNDIFactory() {
		return (DMNDIFactory)getEFactoryInstance();
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
		dmnDecisionServiceDividerLineEClass = createEClass(DMN_DECISION_SERVICE_DIVIDER_LINE);

		dmndiEClass = createEClass(DMNDI);
		createEReference(dmndiEClass, DMNDI__DMN_DIAGRAM);
		createEReference(dmndiEClass, DMNDI__DMN_STYLE);

		dmnDiagramEClass = createEClass(DMN_DIAGRAM);
		createEReference(dmnDiagramEClass, DMN_DIAGRAM__SIZE);
		createEAttribute(dmnDiagramEClass, DMN_DIAGRAM__DMN_DIAGRAM_ELEMENT_GROUP);
		createEReference(dmnDiagramEClass, DMN_DIAGRAM__DMN_DIAGRAM_ELEMENT);
		createEAttribute(dmnDiagramEClass, DMN_DIAGRAM__USE_ALTERNATIVE_INPUT_DATA_SHAPE);

		dmnEdgeEClass = createEClass(DMN_EDGE);
		createEReference(dmnEdgeEClass, DMN_EDGE__DMN_LABEL);
		createEAttribute(dmnEdgeEClass, DMN_EDGE__DMN_ELEMENT_REF);
		createEAttribute(dmnEdgeEClass, DMN_EDGE__SOURCE_ELEMENT);
		createEAttribute(dmnEdgeEClass, DMN_EDGE__TARGET_ELEMENT);

		dmnLabelEClass = createEClass(DMN_LABEL);
		createEAttribute(dmnLabelEClass, DMN_LABEL__TEXT);

		dmnShapeEClass = createEClass(DMN_SHAPE);
		createEReference(dmnShapeEClass, DMN_SHAPE__DMN_LABEL);
		createEReference(dmnShapeEClass, DMN_SHAPE__DMN_DECISION_SERVICE_DIVIDER_LINE);
		createEAttribute(dmnShapeEClass, DMN_SHAPE__DMN_ELEMENT_REF);
		createEAttribute(dmnShapeEClass, DMN_SHAPE__IS_COLLAPSED);
		createEAttribute(dmnShapeEClass, DMN_SHAPE__IS_LISTED_INPUT_DATA);

		dmnStyleEClass = createEClass(DMN_STYLE);
		createEReference(dmnStyleEClass, DMN_STYLE__FILL_COLOR);
		createEReference(dmnStyleEClass, DMN_STYLE__STROKE_COLOR);
		createEReference(dmnStyleEClass, DMN_STYLE__FONT_COLOR);
		createEAttribute(dmnStyleEClass, DMN_STYLE__FONT_BOLD);
		createEAttribute(dmnStyleEClass, DMN_STYLE__FONT_FAMILY);
		createEAttribute(dmnStyleEClass, DMN_STYLE__FONT_ITALIC);
		createEAttribute(dmnStyleEClass, DMN_STYLE__FONT_SIZE);
		createEAttribute(dmnStyleEClass, DMN_STYLE__FONT_STRIKE_THROUGH);
		createEAttribute(dmnStyleEClass, DMN_STYLE__FONT_UNDERLINE);
		createEAttribute(dmnStyleEClass, DMN_STYLE__LABEL_HORIZONTAL_ALIGNEMENT);
		createEAttribute(dmnStyleEClass, DMN_STYLE__LABEL_VERTICAL_ALIGNMENT);

		dmndiRootEClass = createEClass(DMNDI_ROOT);
		createEAttribute(dmndiRootEClass, DMNDI_ROOT__MIXED);
		createEReference(dmndiRootEClass, DMNDI_ROOT__XMLNS_PREFIX_MAP);
		createEReference(dmndiRootEClass, DMNDI_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(dmndiRootEClass, DMNDI_ROOT__DMN_DECISION_SERVICE_DIVIDER_LINE);
		createEReference(dmndiRootEClass, DMNDI_ROOT__DMNDI);
		createEReference(dmndiRootEClass, DMNDI_ROOT__DMN_DIAGRAM);
		createEReference(dmndiRootEClass, DMNDI_ROOT__DMN_DIAGRAM_ELEMENT);
		createEReference(dmndiRootEClass, DMNDI_ROOT__DMN_EDGE);
		createEReference(dmndiRootEClass, DMNDI_ROOT__DMN_LABEL);
		createEReference(dmndiRootEClass, DMNDI_ROOT__DMN_SHAPE);
		createEReference(dmndiRootEClass, DMNDI_ROOT__DMN_STYLE);
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
		dmnDecisionServiceDividerLineEClass.getESuperTypes().add(theDIPackage.getEdge());
		dmnDiagramEClass.getESuperTypes().add(theDIPackage.getDiagram());
		dmnEdgeEClass.getESuperTypes().add(theDIPackage.getEdge());
		dmnLabelEClass.getESuperTypes().add(theDIPackage.getShape());
		dmnShapeEClass.getESuperTypes().add(theDIPackage.getShape());
		dmnStyleEClass.getESuperTypes().add(theDIPackage.getStyle());

		// Initialize classes, features, and operations; add parameters
		initEClass(dmnDecisionServiceDividerLineEClass, DMNDecisionServiceDividerLine.class, "DMNDecisionServiceDividerLine", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dmndiEClass, org.omg.spec.dmn.dmndi.DMNDI.class, "DMNDI", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDMNDI_DMNDiagram(), this.getDMNDiagram(), null, "dMNDiagram", null, 0, -1, org.omg.spec.dmn.dmndi.DMNDI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDMNDI_DMNStyle(), this.getDMNStyle(), null, "dMNStyle", null, 0, -1, org.omg.spec.dmn.dmndi.DMNDI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dmnDiagramEClass, DMNDiagram.class, "DMNDiagram", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDMNDiagram_Size(), theDCPackage.getDimension(), null, "size", null, 0, 1, DMNDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDMNDiagram_DMNDiagramElementGroup(), ecorePackage.getEFeatureMapEntry(), "dMNDiagramElementGroup", null, 0, -1, DMNDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDMNDiagram_DMNDiagramElement(), theDIPackage.getDiagramElement(), null, "dMNDiagramElement", null, 0, -1, DMNDiagram.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDMNDiagram_UseAlternativeInputDataShape(), theXMLTypePackage.getBoolean(), "useAlternativeInputDataShape", "false", 0, 1, DMNDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dmnEdgeEClass, DMNEdge.class, "DMNEdge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDMNEdge_DMNLabel(), this.getDMNLabel(), null, "dMNLabel", null, 0, 1, DMNEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDMNEdge_DmnElementRef(), theXMLTypePackage.getQName(), "dmnElementRef", null, 1, 1, DMNEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDMNEdge_SourceElement(), theXMLTypePackage.getQName(), "sourceElement", null, 0, 1, DMNEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDMNEdge_TargetElement(), theXMLTypePackage.getQName(), "targetElement", null, 0, 1, DMNEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dmnLabelEClass, DMNLabel.class, "DMNLabel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDMNLabel_Text(), theXMLTypePackage.getString(), "text", null, 0, 1, DMNLabel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dmnShapeEClass, DMNShape.class, "DMNShape", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDMNShape_DMNLabel(), this.getDMNLabel(), null, "dMNLabel", null, 0, 1, DMNShape.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDMNShape_DMNDecisionServiceDividerLine(), this.getDMNDecisionServiceDividerLine(), null, "dMNDecisionServiceDividerLine", null, 0, 1, DMNShape.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDMNShape_DmnElementRef(), theXMLTypePackage.getQName(), "dmnElementRef", null, 1, 1, DMNShape.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDMNShape_IsCollapsed(), theXMLTypePackage.getBoolean(), "isCollapsed", "false", 0, 1, DMNShape.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDMNShape_IsListedInputData(), theXMLTypePackage.getBoolean(), "isListedInputData", null, 0, 1, DMNShape.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dmnStyleEClass, DMNStyle.class, "DMNStyle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDMNStyle_FillColor(), theDCPackage.getColor(), null, "fillColor", null, 0, 1, DMNStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDMNStyle_StrokeColor(), theDCPackage.getColor(), null, "strokeColor", null, 0, 1, DMNStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDMNStyle_FontColor(), theDCPackage.getColor(), null, "fontColor", null, 0, 1, DMNStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDMNStyle_FontBold(), theXMLTypePackage.getBoolean(), "fontBold", null, 0, 1, DMNStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDMNStyle_FontFamily(), theXMLTypePackage.getString(), "fontFamily", null, 0, 1, DMNStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDMNStyle_FontItalic(), theXMLTypePackage.getBoolean(), "fontItalic", null, 0, 1, DMNStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDMNStyle_FontSize(), theXMLTypePackage.getDouble(), "fontSize", null, 0, 1, DMNStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDMNStyle_FontStrikeThrough(), theXMLTypePackage.getBoolean(), "fontStrikeThrough", null, 0, 1, DMNStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDMNStyle_FontUnderline(), theXMLTypePackage.getBoolean(), "fontUnderline", null, 0, 1, DMNStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDMNStyle_LabelHorizontalAlignement(), theDCPackage.getAlignmentKind(), "labelHorizontalAlignement", null, 0, 1, DMNStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDMNStyle_LabelVerticalAlignment(), theDCPackage.getAlignmentKind(), "labelVerticalAlignment", null, 0, 1, DMNStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dmndiRootEClass, DMNDIRoot.class, "DMNDIRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDMNDIRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDMNDIRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDMNDIRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDMNDIRoot_DMNDecisionServiceDividerLine(), this.getDMNDecisionServiceDividerLine(), null, "dMNDecisionServiceDividerLine", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDMNDIRoot_DMNDI(), this.getDMNDI(), null, "dMNDI", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDMNDIRoot_DMNDiagram(), this.getDMNDiagram(), null, "dMNDiagram", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDMNDIRoot_DMNDiagramElement(), theDIPackage.getDiagramElement(), null, "dMNDiagramElement", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDMNDIRoot_DMNEdge(), this.getDMNEdge(), null, "dMNEdge", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDMNDIRoot_DMNLabel(), this.getDMNLabel(), null, "dMNLabel", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDMNDIRoot_DMNShape(), this.getDMNShape(), null, "dMNShape", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDMNDIRoot_DMNStyle(), this.getDMNStyle(), null, "dMNStyle", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

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
		  (dmnDecisionServiceDividerLineEClass,
		   source,
		   new String[] {
			   "name", "DMNDecisionServiceDividerLine",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (dmndiEClass,
		   source,
		   new String[] {
			   "name", "DMNDI",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getDMNDI_DMNDiagram(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DMNDiagram",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDMNDI_DMNStyle(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DMNStyle",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (dmnDiagramEClass,
		   source,
		   new String[] {
			   "name", "DMNDiagram",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getDMNDiagram_Size(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Size",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDMNDiagram_DMNDiagramElementGroup(),
		   source,
		   new String[] {
			   "kind", "group",
			   "name", "DMNDiagramElement:group",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDMNDiagram_DMNDiagramElement(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DMNDiagramElement",
			   "namespace", "##targetNamespace",
			   "group", "DMNDiagramElement:group"
		   });
		addAnnotation
		  (getDMNDiagram_UseAlternativeInputDataShape(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "useAlternativeInputDataShape"
		   });
		addAnnotation
		  (dmnEdgeEClass,
		   source,
		   new String[] {
			   "name", "DMNEdge",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getDMNEdge_DMNLabel(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DMNLabel",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDMNEdge_DmnElementRef(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "dmnElementRef"
		   });
		addAnnotation
		  (getDMNEdge_SourceElement(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "sourceElement"
		   });
		addAnnotation
		  (getDMNEdge_TargetElement(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "targetElement"
		   });
		addAnnotation
		  (dmnLabelEClass,
		   source,
		   new String[] {
			   "name", "DMNLabel",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getDMNLabel_Text(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Text",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (dmnShapeEClass,
		   source,
		   new String[] {
			   "name", "DMNShape",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getDMNShape_DMNLabel(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DMNLabel",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDMNShape_DMNDecisionServiceDividerLine(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DMNDecisionServiceDividerLine",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDMNShape_DmnElementRef(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "dmnElementRef"
		   });
		addAnnotation
		  (getDMNShape_IsCollapsed(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "isCollapsed"
		   });
		addAnnotation
		  (getDMNShape_IsListedInputData(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "isListedInputData"
		   });
		addAnnotation
		  (dmnStyleEClass,
		   source,
		   new String[] {
			   "name", "DMNStyle",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getDMNStyle_FillColor(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "FillColor",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDMNStyle_StrokeColor(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "StrokeColor",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDMNStyle_FontColor(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "FontColor",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDMNStyle_FontBold(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "fontBold"
		   });
		addAnnotation
		  (getDMNStyle_FontFamily(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "fontFamily"
		   });
		addAnnotation
		  (getDMNStyle_FontItalic(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "fontItalic"
		   });
		addAnnotation
		  (getDMNStyle_FontSize(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "fontSize"
		   });
		addAnnotation
		  (getDMNStyle_FontStrikeThrough(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "fontStrikeThrough"
		   });
		addAnnotation
		  (getDMNStyle_FontUnderline(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "fontUnderline"
		   });
		addAnnotation
		  (getDMNStyle_LabelHorizontalAlignement(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "labelHorizontalAlignement"
		   });
		addAnnotation
		  (getDMNStyle_LabelVerticalAlignment(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "labelVerticalAlignment"
		   });
		addAnnotation
		  (dmndiRootEClass,
		   source,
		   new String[] {
			   "name", "",
			   "kind", "mixed"
		   });
		addAnnotation
		  (getDMNDIRoot_Mixed(),
		   source,
		   new String[] {
			   "kind", "elementWildcard",
			   "name", ":mixed"
		   });
		addAnnotation
		  (getDMNDIRoot_XMLNSPrefixMap(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "xmlns:prefix"
		   });
		addAnnotation
		  (getDMNDIRoot_XSISchemaLocation(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "xsi:schemaLocation"
		   });
		addAnnotation
		  (getDMNDIRoot_DMNDecisionServiceDividerLine(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DMNDecisionServiceDividerLine",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDMNDIRoot_DMNDI(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DMNDI",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDMNDIRoot_DMNDiagram(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DMNDiagram",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDMNDIRoot_DMNDiagramElement(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DMNDiagramElement",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDMNDIRoot_DMNEdge(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DMNEdge",
			   "namespace", "##targetNamespace",
			   "affiliation", "DMNDiagramElement"
		   });
		addAnnotation
		  (getDMNDIRoot_DMNLabel(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DMNLabel",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDMNDIRoot_DMNShape(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DMNShape",
			   "namespace", "##targetNamespace",
			   "affiliation", "DMNDiagramElement"
		   });
		addAnnotation
		  (getDMNDIRoot_DMNStyle(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DMNStyle",
			   "namespace", "##targetNamespace",
			   "affiliation", "http://www.omg.org/spec/DMN/20180521/DI/#Style"
		   });
	}

} //DMNDIPackageImpl
