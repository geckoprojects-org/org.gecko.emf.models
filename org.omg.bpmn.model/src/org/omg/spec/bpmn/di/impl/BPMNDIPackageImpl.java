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
package org.omg.spec.bpmn.di.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.omg.spec.bpmn.bpmn.BPMNPackage;

import org.omg.spec.bpmn.bpmn.impl.BPMNPackageImpl;

import org.omg.spec.bpmn.di.BPMNDIFactory;
import org.omg.spec.bpmn.di.BPMNDIPackage;
import org.omg.spec.bpmn.di.BPMNDIRoot;
import org.omg.spec.bpmn.di.BPMNDiagram;
import org.omg.spec.bpmn.di.BPMNEdge;
import org.omg.spec.bpmn.di.BPMNLabel;
import org.omg.spec.bpmn.di.BPMNLabelStyle;
import org.omg.spec.bpmn.di.BPMNPlane;
import org.omg.spec.bpmn.di.BPMNShape;
import org.omg.spec.bpmn.di.MessageVisibleKind;
import org.omg.spec.bpmn.di.ParticipantBandKind;

import org.omg.spec.dd.dc.DCPackage;

import org.omg.spec.dd.dc.impl.DCPackageImpl;

import org.omg.spec.dd.di.DIPackage;

import org.omg.spec.dd.di.impl.DIPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BPMNDIPackageImpl extends EPackageImpl implements BPMNDIPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bpmnDiagramEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bpmnEdgeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bpmnLabelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bpmnLabelStyleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bpmnPlaneEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bpmnShapeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bpmndiRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum messageVisibleKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum participantBandKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType messageVisibleKindObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType participantBandKindObjectEDataType = null;

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
	 * @see org.omg.spec.bpmn.di.BPMNDIPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private BPMNDIPackageImpl() {
		super(eNS_URI, BPMNDIFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link BPMNDIPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static BPMNDIPackage init() {
		if (isInited) return (BPMNDIPackage)EPackage.Registry.INSTANCE.getEPackage(BPMNDIPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredBPMNDIPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		BPMNDIPackageImpl theBPMNDIPackage = registeredBPMNDIPackage instanceof BPMNDIPackageImpl ? (BPMNDIPackageImpl)registeredBPMNDIPackage : new BPMNDIPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(BPMNPackage.eNS_URI);
		BPMNPackageImpl theBPMNPackage = (BPMNPackageImpl)(registeredPackage instanceof BPMNPackageImpl ? registeredPackage : BPMNPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(DCPackage.eNS_URI);
		DCPackageImpl theDCPackage = (DCPackageImpl)(registeredPackage instanceof DCPackageImpl ? registeredPackage : DCPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(DIPackage.eNS_URI);
		DIPackageImpl theDIPackage = (DIPackageImpl)(registeredPackage instanceof DIPackageImpl ? registeredPackage : DIPackage.eINSTANCE);

		// Load packages
		theBPMNPackage.loadPackage();

		// Create package meta-data objects
		theBPMNDIPackage.createPackageContents();
		theDCPackage.createPackageContents();
		theDIPackage.createPackageContents();

		// Initialize created meta-data
		theBPMNDIPackage.initializePackageContents();
		theDCPackage.initializePackageContents();
		theDIPackage.initializePackageContents();

		// Fix loaded packages
		theBPMNPackage.fixPackageContents();

		// Mark meta-data to indicate it can't be changed
		theBPMNDIPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(BPMNDIPackage.eNS_URI, theBPMNDIPackage);
		return theBPMNDIPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBPMNDiagram() {
		return bpmnDiagramEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBPMNDiagram_BPMNPlane() {
		return (EReference)bpmnDiagramEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBPMNDiagram_BPMNLabelStyle() {
		return (EReference)bpmnDiagramEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBPMNEdge() {
		return bpmnEdgeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBPMNEdge_BPMNLabel() {
		return (EReference)bpmnEdgeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBPMNEdge_BpmnElement() {
		return (EAttribute)bpmnEdgeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBPMNEdge_MessageVisibleKind() {
		return (EAttribute)bpmnEdgeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBPMNEdge_SourceElement() {
		return (EAttribute)bpmnEdgeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBPMNEdge_TargetElement() {
		return (EAttribute)bpmnEdgeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBPMNLabel() {
		return bpmnLabelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBPMNLabel_LabelStyle() {
		return (EAttribute)bpmnLabelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBPMNLabelStyle() {
		return bpmnLabelStyleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBPMNLabelStyle_Font() {
		return (EReference)bpmnLabelStyleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBPMNPlane() {
		return bpmnPlaneEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBPMNPlane_BpmnElement() {
		return (EAttribute)bpmnPlaneEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBPMNShape() {
		return bpmnShapeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBPMNShape_BPMNLabel() {
		return (EReference)bpmnShapeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBPMNShape_BpmnElement() {
		return (EAttribute)bpmnShapeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBPMNShape_ChoreographyActivityShape() {
		return (EAttribute)bpmnShapeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBPMNShape_IsExpanded() {
		return (EAttribute)bpmnShapeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBPMNShape_IsHorizontal() {
		return (EAttribute)bpmnShapeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBPMNShape_IsMarkerVisible() {
		return (EAttribute)bpmnShapeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBPMNShape_IsMessageVisible() {
		return (EAttribute)bpmnShapeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBPMNShape_ParticipantBandKind() {
		return (EAttribute)bpmnShapeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBPMNDIRoot() {
		return bpmndiRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBPMNDIRoot_Mixed() {
		return (EAttribute)bpmndiRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBPMNDIRoot_XMLNSPrefixMap() {
		return (EReference)bpmndiRootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBPMNDIRoot_XSISchemaLocation() {
		return (EReference)bpmndiRootEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBPMNDIRoot_BPMNDiagram() {
		return (EReference)bpmndiRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBPMNDIRoot_BPMNEdge() {
		return (EReference)bpmndiRootEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBPMNDIRoot_BPMNLabel() {
		return (EReference)bpmndiRootEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBPMNDIRoot_BPMNLabelStyle() {
		return (EReference)bpmndiRootEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBPMNDIRoot_BPMNPlane() {
		return (EReference)bpmndiRootEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBPMNDIRoot_BPMNShape() {
		return (EReference)bpmndiRootEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getMessageVisibleKind() {
		return messageVisibleKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getParticipantBandKind() {
		return participantBandKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getMessageVisibleKindObject() {
		return messageVisibleKindObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getParticipantBandKindObject() {
		return participantBandKindObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BPMNDIFactory getBPMNDIFactory() {
		return (BPMNDIFactory)getEFactoryInstance();
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
		bpmnDiagramEClass = createEClass(BPMN_DIAGRAM);
		createEReference(bpmnDiagramEClass, BPMN_DIAGRAM__BPMN_PLANE);
		createEReference(bpmnDiagramEClass, BPMN_DIAGRAM__BPMN_LABEL_STYLE);

		bpmnEdgeEClass = createEClass(BPMN_EDGE);
		createEReference(bpmnEdgeEClass, BPMN_EDGE__BPMN_LABEL);
		createEAttribute(bpmnEdgeEClass, BPMN_EDGE__BPMN_ELEMENT);
		createEAttribute(bpmnEdgeEClass, BPMN_EDGE__MESSAGE_VISIBLE_KIND);
		createEAttribute(bpmnEdgeEClass, BPMN_EDGE__SOURCE_ELEMENT);
		createEAttribute(bpmnEdgeEClass, BPMN_EDGE__TARGET_ELEMENT);

		bpmnLabelEClass = createEClass(BPMN_LABEL);
		createEAttribute(bpmnLabelEClass, BPMN_LABEL__LABEL_STYLE);

		bpmnLabelStyleEClass = createEClass(BPMN_LABEL_STYLE);
		createEReference(bpmnLabelStyleEClass, BPMN_LABEL_STYLE__FONT);

		bpmnPlaneEClass = createEClass(BPMN_PLANE);
		createEAttribute(bpmnPlaneEClass, BPMN_PLANE__BPMN_ELEMENT);

		bpmnShapeEClass = createEClass(BPMN_SHAPE);
		createEReference(bpmnShapeEClass, BPMN_SHAPE__BPMN_LABEL);
		createEAttribute(bpmnShapeEClass, BPMN_SHAPE__BPMN_ELEMENT);
		createEAttribute(bpmnShapeEClass, BPMN_SHAPE__CHOREOGRAPHY_ACTIVITY_SHAPE);
		createEAttribute(bpmnShapeEClass, BPMN_SHAPE__IS_EXPANDED);
		createEAttribute(bpmnShapeEClass, BPMN_SHAPE__IS_HORIZONTAL);
		createEAttribute(bpmnShapeEClass, BPMN_SHAPE__IS_MARKER_VISIBLE);
		createEAttribute(bpmnShapeEClass, BPMN_SHAPE__IS_MESSAGE_VISIBLE);
		createEAttribute(bpmnShapeEClass, BPMN_SHAPE__PARTICIPANT_BAND_KIND);

		bpmndiRootEClass = createEClass(BPMNDI_ROOT);
		createEAttribute(bpmndiRootEClass, BPMNDI_ROOT__MIXED);
		createEReference(bpmndiRootEClass, BPMNDI_ROOT__XMLNS_PREFIX_MAP);
		createEReference(bpmndiRootEClass, BPMNDI_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(bpmndiRootEClass, BPMNDI_ROOT__BPMN_DIAGRAM);
		createEReference(bpmndiRootEClass, BPMNDI_ROOT__BPMN_EDGE);
		createEReference(bpmndiRootEClass, BPMNDI_ROOT__BPMN_LABEL);
		createEReference(bpmndiRootEClass, BPMNDI_ROOT__BPMN_LABEL_STYLE);
		createEReference(bpmndiRootEClass, BPMNDI_ROOT__BPMN_PLANE);
		createEReference(bpmndiRootEClass, BPMNDI_ROOT__BPMN_SHAPE);

		// Create enums
		messageVisibleKindEEnum = createEEnum(MESSAGE_VISIBLE_KIND);
		participantBandKindEEnum = createEEnum(PARTICIPANT_BAND_KIND);

		// Create data types
		messageVisibleKindObjectEDataType = createEDataType(MESSAGE_VISIBLE_KIND_OBJECT);
		participantBandKindObjectEDataType = createEDataType(PARTICIPANT_BAND_KIND_OBJECT);
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
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);
		DCPackage theDCPackage = (DCPackage)EPackage.Registry.INSTANCE.getEPackage(DCPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		bpmnDiagramEClass.getESuperTypes().add(theDIPackage.getDiagram());
		bpmnEdgeEClass.getESuperTypes().add(theDIPackage.getLabeledEdge());
		bpmnLabelEClass.getESuperTypes().add(theDIPackage.getLabel());
		bpmnLabelStyleEClass.getESuperTypes().add(theDIPackage.getStyle());
		bpmnPlaneEClass.getESuperTypes().add(theDIPackage.getPlane());
		bpmnShapeEClass.getESuperTypes().add(theDIPackage.getLabeledShape());

		// Initialize classes, features, and operations; add parameters
		initEClass(bpmnDiagramEClass, BPMNDiagram.class, "BPMNDiagram", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBPMNDiagram_BPMNPlane(), this.getBPMNPlane(), null, "bPMNPlane", null, 1, 1, BPMNDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBPMNDiagram_BPMNLabelStyle(), this.getBPMNLabelStyle(), null, "bPMNLabelStyle", null, 0, -1, BPMNDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bpmnEdgeEClass, BPMNEdge.class, "BPMNEdge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBPMNEdge_BPMNLabel(), this.getBPMNLabel(), null, "bPMNLabel", null, 0, 1, BPMNEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBPMNEdge_BpmnElement(), theXMLTypePackage.getQName(), "bpmnElement", null, 0, 1, BPMNEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBPMNEdge_MessageVisibleKind(), this.getMessageVisibleKind(), "messageVisibleKind", null, 0, 1, BPMNEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBPMNEdge_SourceElement(), theXMLTypePackage.getQName(), "sourceElement", null, 0, 1, BPMNEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBPMNEdge_TargetElement(), theXMLTypePackage.getQName(), "targetElement", null, 0, 1, BPMNEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bpmnLabelEClass, BPMNLabel.class, "BPMNLabel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBPMNLabel_LabelStyle(), theXMLTypePackage.getQName(), "labelStyle", null, 0, 1, BPMNLabel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bpmnLabelStyleEClass, BPMNLabelStyle.class, "BPMNLabelStyle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBPMNLabelStyle_Font(), theDCPackage.getFont(), null, "font", null, 1, 1, BPMNLabelStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bpmnPlaneEClass, BPMNPlane.class, "BPMNPlane", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBPMNPlane_BpmnElement(), theXMLTypePackage.getQName(), "bpmnElement", null, 0, 1, BPMNPlane.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bpmnShapeEClass, BPMNShape.class, "BPMNShape", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBPMNShape_BPMNLabel(), this.getBPMNLabel(), null, "bPMNLabel", null, 0, 1, BPMNShape.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBPMNShape_BpmnElement(), theXMLTypePackage.getQName(), "bpmnElement", null, 0, 1, BPMNShape.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBPMNShape_ChoreographyActivityShape(), theXMLTypePackage.getQName(), "choreographyActivityShape", null, 0, 1, BPMNShape.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBPMNShape_IsExpanded(), theXMLTypePackage.getBoolean(), "isExpanded", null, 0, 1, BPMNShape.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBPMNShape_IsHorizontal(), theXMLTypePackage.getBoolean(), "isHorizontal", null, 0, 1, BPMNShape.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBPMNShape_IsMarkerVisible(), theXMLTypePackage.getBoolean(), "isMarkerVisible", null, 0, 1, BPMNShape.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBPMNShape_IsMessageVisible(), theXMLTypePackage.getBoolean(), "isMessageVisible", null, 0, 1, BPMNShape.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBPMNShape_ParticipantBandKind(), this.getParticipantBandKind(), "participantBandKind", null, 0, 1, BPMNShape.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bpmndiRootEClass, BPMNDIRoot.class, "BPMNDIRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBPMNDIRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBPMNDIRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBPMNDIRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBPMNDIRoot_BPMNDiagram(), this.getBPMNDiagram(), null, "bPMNDiagram", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getBPMNDIRoot_BPMNEdge(), this.getBPMNEdge(), null, "bPMNEdge", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getBPMNDIRoot_BPMNLabel(), this.getBPMNLabel(), null, "bPMNLabel", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getBPMNDIRoot_BPMNLabelStyle(), this.getBPMNLabelStyle(), null, "bPMNLabelStyle", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getBPMNDIRoot_BPMNPlane(), this.getBPMNPlane(), null, "bPMNPlane", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getBPMNDIRoot_BPMNShape(), this.getBPMNShape(), null, "bPMNShape", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(messageVisibleKindEEnum, MessageVisibleKind.class, "MessageVisibleKind");
		addEEnumLiteral(messageVisibleKindEEnum, MessageVisibleKind.INITIATING);
		addEEnumLiteral(messageVisibleKindEEnum, MessageVisibleKind.NON_INITIATING);

		initEEnum(participantBandKindEEnum, ParticipantBandKind.class, "ParticipantBandKind");
		addEEnumLiteral(participantBandKindEEnum, ParticipantBandKind.TOP_INITIATING);
		addEEnumLiteral(participantBandKindEEnum, ParticipantBandKind.MIDDLE_INITIATING);
		addEEnumLiteral(participantBandKindEEnum, ParticipantBandKind.BOTTOM_INITIATING);
		addEEnumLiteral(participantBandKindEEnum, ParticipantBandKind.TOP_NON_INITIATING);
		addEEnumLiteral(participantBandKindEEnum, ParticipantBandKind.MIDDLE_NON_INITIATING);
		addEEnumLiteral(participantBandKindEEnum, ParticipantBandKind.BOTTOM_NON_INITIATING);

		// Initialize data types
		initEDataType(messageVisibleKindObjectEDataType, MessageVisibleKind.class, "MessageVisibleKindObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(participantBandKindObjectEDataType, ParticipantBandKind.class, "ParticipantBandKindObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);

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
		  (bpmnDiagramEClass,
		   source,
		   new String[] {
			   "name", "BPMNDiagram",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getBPMNDiagram_BPMNPlane(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "BPMNPlane",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getBPMNDiagram_BPMNLabelStyle(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "BPMNLabelStyle",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (bpmnEdgeEClass,
		   source,
		   new String[] {
			   "name", "BPMNEdge",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getBPMNEdge_BPMNLabel(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "BPMNLabel",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getBPMNEdge_BpmnElement(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "bpmnElement"
		   });
		addAnnotation
		  (getBPMNEdge_MessageVisibleKind(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "messageVisibleKind"
		   });
		addAnnotation
		  (getBPMNEdge_SourceElement(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "sourceElement"
		   });
		addAnnotation
		  (getBPMNEdge_TargetElement(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "targetElement"
		   });
		addAnnotation
		  (bpmnLabelEClass,
		   source,
		   new String[] {
			   "name", "BPMNLabel",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getBPMNLabel_LabelStyle(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "labelStyle"
		   });
		addAnnotation
		  (bpmnLabelStyleEClass,
		   source,
		   new String[] {
			   "name", "BPMNLabelStyle",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getBPMNLabelStyle_Font(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Font",
			   "namespace", "http://www.omg.org/spec/DD/20100524/DC"
		   });
		addAnnotation
		  (bpmnPlaneEClass,
		   source,
		   new String[] {
			   "name", "BPMNPlane",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getBPMNPlane_BpmnElement(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "bpmnElement"
		   });
		addAnnotation
		  (bpmnShapeEClass,
		   source,
		   new String[] {
			   "name", "BPMNShape",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getBPMNShape_BPMNLabel(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "BPMNLabel",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getBPMNShape_BpmnElement(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "bpmnElement"
		   });
		addAnnotation
		  (getBPMNShape_ChoreographyActivityShape(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "choreographyActivityShape"
		   });
		addAnnotation
		  (getBPMNShape_IsExpanded(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "isExpanded"
		   });
		addAnnotation
		  (getBPMNShape_IsHorizontal(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "isHorizontal"
		   });
		addAnnotation
		  (getBPMNShape_IsMarkerVisible(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "isMarkerVisible"
		   });
		addAnnotation
		  (getBPMNShape_IsMessageVisible(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "isMessageVisible"
		   });
		addAnnotation
		  (getBPMNShape_ParticipantBandKind(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "participantBandKind"
		   });
		addAnnotation
		  (bpmndiRootEClass,
		   source,
		   new String[] {
			   "name", "",
			   "kind", "mixed"
		   });
		addAnnotation
		  (getBPMNDIRoot_Mixed(),
		   source,
		   new String[] {
			   "kind", "elementWildcard",
			   "name", ":mixed"
		   });
		addAnnotation
		  (getBPMNDIRoot_XMLNSPrefixMap(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "xmlns:prefix"
		   });
		addAnnotation
		  (getBPMNDIRoot_XSISchemaLocation(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "xsi:schemaLocation"
		   });
		addAnnotation
		  (getBPMNDIRoot_BPMNDiagram(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "BPMNDiagram",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getBPMNDIRoot_BPMNEdge(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "BPMNEdge",
			   "namespace", "##targetNamespace",
			   "affiliation", "http://www.omg.org/spec/DD/20100524/DI#DiagramElement"
		   });
		addAnnotation
		  (getBPMNDIRoot_BPMNLabel(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "BPMNLabel",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getBPMNDIRoot_BPMNLabelStyle(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "BPMNLabelStyle",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getBPMNDIRoot_BPMNPlane(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "BPMNPlane",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getBPMNDIRoot_BPMNShape(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "BPMNShape",
			   "namespace", "##targetNamespace",
			   "affiliation", "http://www.omg.org/spec/DD/20100524/DI#DiagramElement"
		   });
		addAnnotation
		  (messageVisibleKindEEnum,
		   source,
		   new String[] {
			   "name", "MessageVisibleKind"
		   });
		addAnnotation
		  (messageVisibleKindObjectEDataType,
		   source,
		   new String[] {
			   "name", "MessageVisibleKind:Object",
			   "baseType", "MessageVisibleKind"
		   });
		addAnnotation
		  (participantBandKindEEnum,
		   source,
		   new String[] {
			   "name", "ParticipantBandKind"
		   });
		addAnnotation
		  (participantBandKindObjectEDataType,
		   source,
		   new String[] {
			   "name", "ParticipantBandKind:Object",
			   "baseType", "ParticipantBandKind"
		   });
	}

} //BPMNDIPackageImpl
