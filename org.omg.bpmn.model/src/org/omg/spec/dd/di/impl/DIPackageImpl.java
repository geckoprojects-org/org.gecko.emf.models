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
package org.omg.spec.dd.di.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.omg.spec.bpmn.bpmn.BPMNPackage;

import org.omg.spec.bpmn.bpmn.impl.BPMNPackageImpl;

import org.omg.spec.bpmn.di.BPMNDIPackage;

import org.omg.spec.bpmn.di.impl.BPMNDIPackageImpl;

import org.omg.spec.dd.dc.DCPackage;

import org.omg.spec.dd.dc.impl.DCPackageImpl;

import org.omg.spec.dd.di.DIFactory;
import org.omg.spec.dd.di.DIPackage;
import org.omg.spec.dd.di.DIRoot;
import org.omg.spec.dd.di.Diagram;
import org.omg.spec.dd.di.DiagramElement;
import org.omg.spec.dd.di.Edge;
import org.omg.spec.dd.di.ExtensionType;
import org.omg.spec.dd.di.Label;
import org.omg.spec.dd.di.LabeledEdge;
import org.omg.spec.dd.di.LabeledShape;
import org.omg.spec.dd.di.Node;
import org.omg.spec.dd.di.Plane;
import org.omg.spec.dd.di.Shape;
import org.omg.spec.dd.di.Style;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DIPackageImpl extends EPackageImpl implements DIPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diagramEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diagramElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass edgeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass extensionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass labelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass labeledEdgeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass labeledShapeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass planeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shapeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass styleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diRootEClass = null;

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
	 * @see org.omg.spec.dd.di.DIPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DIPackageImpl() {
		super(eNS_URI, DIFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link DIPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DIPackage init() {
		if (isInited) return (DIPackage)EPackage.Registry.INSTANCE.getEPackage(DIPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredDIPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		DIPackageImpl theDIPackage = registeredDIPackage instanceof DIPackageImpl ? (DIPackageImpl)registeredDIPackage : new DIPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(BPMNPackage.eNS_URI);
		BPMNPackageImpl theBPMNPackage = (BPMNPackageImpl)(registeredPackage instanceof BPMNPackageImpl ? registeredPackage : BPMNPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(DCPackage.eNS_URI);
		DCPackageImpl theDCPackage = (DCPackageImpl)(registeredPackage instanceof DCPackageImpl ? registeredPackage : DCPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(BPMNDIPackage.eNS_URI);
		BPMNDIPackageImpl theBPMNDIPackage = (BPMNDIPackageImpl)(registeredPackage instanceof BPMNDIPackageImpl ? registeredPackage : BPMNDIPackage.eINSTANCE);

		// Load packages
		theBPMNPackage.loadPackage();

		// Create package meta-data objects
		theDIPackage.createPackageContents();
		theDCPackage.createPackageContents();
		theBPMNDIPackage.createPackageContents();

		// Initialize created meta-data
		theDIPackage.initializePackageContents();
		theDCPackage.initializePackageContents();
		theBPMNDIPackage.initializePackageContents();

		// Fix loaded packages
		theBPMNPackage.fixPackageContents();

		// Mark meta-data to indicate it can't be changed
		theDIPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DIPackage.eNS_URI, theDIPackage);
		return theDIPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDiagram() {
		return diagramEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiagram_Documentation() {
		return (EAttribute)diagramEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiagram_Id() {
		return (EAttribute)diagramEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiagram_Name() {
		return (EAttribute)diagramEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiagram_Resolution() {
		return (EAttribute)diagramEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDiagramElement() {
		return diagramElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDiagramElement_Extension() {
		return (EReference)diagramElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiagramElement_Id() {
		return (EAttribute)diagramElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiagramElement_AnyAttribute() {
		return (EAttribute)diagramElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEdge() {
		return edgeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEdge_Waypoint() {
		return (EReference)edgeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExtensionType() {
		return extensionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExtensionType_Any() {
		return (EAttribute)extensionTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLabel() {
		return labelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLabel_Bounds() {
		return (EReference)labelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLabeledEdge() {
		return labeledEdgeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLabeledShape() {
		return labeledShapeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNode() {
		return nodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPlane() {
		return planeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPlane_DiagramElementGroup() {
		return (EAttribute)planeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPlane_DiagramElement() {
		return (EReference)planeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getShape() {
		return shapeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getShape_Bounds() {
		return (EReference)shapeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStyle() {
		return styleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStyle_Id() {
		return (EAttribute)styleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDIRoot() {
		return diRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDIRoot_Mixed() {
		return (EAttribute)diRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDIRoot_XMLNSPrefixMap() {
		return (EReference)diRootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDIRoot_XSISchemaLocation() {
		return (EReference)diRootEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDIRoot_DiagramElement() {
		return (EReference)diRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDIRoot_Diagram() {
		return (EReference)diRootEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDIRoot_Edge() {
		return (EReference)diRootEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDIRoot_Label() {
		return (EReference)diRootEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDIRoot_LabeledEdge() {
		return (EReference)diRootEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDIRoot_LabeledShape() {
		return (EReference)diRootEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDIRoot_Node() {
		return (EReference)diRootEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDIRoot_Plane() {
		return (EReference)diRootEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDIRoot_Shape() {
		return (EReference)diRootEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDIRoot_Style() {
		return (EReference)diRootEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DIFactory getDIFactory() {
		return (DIFactory)getEFactoryInstance();
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
		diagramEClass = createEClass(DIAGRAM);
		createEAttribute(diagramEClass, DIAGRAM__DOCUMENTATION);
		createEAttribute(diagramEClass, DIAGRAM__ID);
		createEAttribute(diagramEClass, DIAGRAM__NAME);
		createEAttribute(diagramEClass, DIAGRAM__RESOLUTION);

		diagramElementEClass = createEClass(DIAGRAM_ELEMENT);
		createEReference(diagramElementEClass, DIAGRAM_ELEMENT__EXTENSION);
		createEAttribute(diagramElementEClass, DIAGRAM_ELEMENT__ID);
		createEAttribute(diagramElementEClass, DIAGRAM_ELEMENT__ANY_ATTRIBUTE);

		edgeEClass = createEClass(EDGE);
		createEReference(edgeEClass, EDGE__WAYPOINT);

		extensionTypeEClass = createEClass(EXTENSION_TYPE);
		createEAttribute(extensionTypeEClass, EXTENSION_TYPE__ANY);

		labelEClass = createEClass(LABEL);
		createEReference(labelEClass, LABEL__BOUNDS);

		labeledEdgeEClass = createEClass(LABELED_EDGE);

		labeledShapeEClass = createEClass(LABELED_SHAPE);

		nodeEClass = createEClass(NODE);

		planeEClass = createEClass(PLANE);
		createEAttribute(planeEClass, PLANE__DIAGRAM_ELEMENT_GROUP);
		createEReference(planeEClass, PLANE__DIAGRAM_ELEMENT);

		shapeEClass = createEClass(SHAPE);
		createEReference(shapeEClass, SHAPE__BOUNDS);

		styleEClass = createEClass(STYLE);
		createEAttribute(styleEClass, STYLE__ID);

		diRootEClass = createEClass(DI_ROOT);
		createEAttribute(diRootEClass, DI_ROOT__MIXED);
		createEReference(diRootEClass, DI_ROOT__XMLNS_PREFIX_MAP);
		createEReference(diRootEClass, DI_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(diRootEClass, DI_ROOT__DIAGRAM_ELEMENT);
		createEReference(diRootEClass, DI_ROOT__DIAGRAM);
		createEReference(diRootEClass, DI_ROOT__EDGE);
		createEReference(diRootEClass, DI_ROOT__LABEL);
		createEReference(diRootEClass, DI_ROOT__LABELED_EDGE);
		createEReference(diRootEClass, DI_ROOT__LABELED_SHAPE);
		createEReference(diRootEClass, DI_ROOT__NODE);
		createEReference(diRootEClass, DI_ROOT__PLANE);
		createEReference(diRootEClass, DI_ROOT__SHAPE);
		createEReference(diRootEClass, DI_ROOT__STYLE);
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
		DCPackage theDCPackage = (DCPackage)EPackage.Registry.INSTANCE.getEPackage(DCPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		edgeEClass.getESuperTypes().add(this.getDiagramElement());
		labelEClass.getESuperTypes().add(this.getNode());
		labeledEdgeEClass.getESuperTypes().add(this.getEdge());
		labeledShapeEClass.getESuperTypes().add(this.getShape());
		nodeEClass.getESuperTypes().add(this.getDiagramElement());
		planeEClass.getESuperTypes().add(this.getNode());
		shapeEClass.getESuperTypes().add(this.getNode());

		// Initialize classes, features, and operations; add parameters
		initEClass(diagramEClass, Diagram.class, "Diagram", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiagram_Documentation(), theXMLTypePackage.getString(), "documentation", null, 0, 1, Diagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiagram_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, Diagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiagram_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, Diagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiagram_Resolution(), theXMLTypePackage.getDouble(), "resolution", null, 0, 1, Diagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diagramElementEClass, DiagramElement.class, "DiagramElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDiagramElement_Extension(), this.getExtensionType(), null, "extension", null, 0, 1, DiagramElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiagramElement_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, DiagramElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiagramElement_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, DiagramElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(edgeEClass, Edge.class, "Edge", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEdge_Waypoint(), theDCPackage.getPoint(), null, "waypoint", null, 2, -1, Edge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(extensionTypeEClass, ExtensionType.class, "ExtensionType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExtensionType_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, ExtensionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(labelEClass, Label.class, "Label", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLabel_Bounds(), theDCPackage.getBounds(), null, "bounds", null, 0, 1, Label.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(labeledEdgeEClass, LabeledEdge.class, "LabeledEdge", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(labeledShapeEClass, LabeledShape.class, "LabeledShape", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(nodeEClass, Node.class, "Node", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(planeEClass, Plane.class, "Plane", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPlane_DiagramElementGroup(), ecorePackage.getEFeatureMapEntry(), "diagramElementGroup", null, 0, -1, Plane.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlane_DiagramElement(), this.getDiagramElement(), null, "diagramElement", null, 0, -1, Plane.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(shapeEClass, Shape.class, "Shape", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getShape_Bounds(), theDCPackage.getBounds(), null, "bounds", null, 1, 1, Shape.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(styleEClass, Style.class, "Style", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStyle_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, Style.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diRootEClass, DIRoot.class, "DIRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDIRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDIRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDIRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDIRoot_DiagramElement(), this.getDiagramElement(), null, "diagramElement", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDIRoot_Diagram(), this.getDiagram(), null, "diagram", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDIRoot_Edge(), this.getEdge(), null, "edge", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDIRoot_Label(), this.getLabel(), null, "label", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDIRoot_LabeledEdge(), this.getLabeledEdge(), null, "labeledEdge", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDIRoot_LabeledShape(), this.getLabeledShape(), null, "labeledShape", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDIRoot_Node(), this.getNode(), null, "node", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDIRoot_Plane(), this.getPlane(), null, "plane", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDIRoot_Shape(), this.getShape(), null, "shape", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDIRoot_Style(), this.getStyle(), null, "style", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

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
		  (diagramEClass,
		   source,
		   new String[] {
			   "name", "Diagram",
			   "kind", "empty"
		   });
		addAnnotation
		  (getDiagram_Documentation(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "documentation"
		   });
		addAnnotation
		  (getDiagram_Id(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "id"
		   });
		addAnnotation
		  (getDiagram_Name(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "name"
		   });
		addAnnotation
		  (getDiagram_Resolution(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "resolution"
		   });
		addAnnotation
		  (diagramElementEClass,
		   source,
		   new String[] {
			   "name", "DiagramElement",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getDiagramElement_Extension(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "extension",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDiagramElement_Id(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "id"
		   });
		addAnnotation
		  (getDiagramElement_AnyAttribute(),
		   source,
		   new String[] {
			   "kind", "attributeWildcard",
			   "wildcards", "##other",
			   "name", ":2",
			   "processing", "lax"
		   });
		addAnnotation
		  (edgeEClass,
		   source,
		   new String[] {
			   "name", "Edge",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getEdge_Waypoint(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "waypoint",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (extensionTypeEClass,
		   source,
		   new String[] {
			   "name", "extension_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getExtensionType_Any(),
		   source,
		   new String[] {
			   "kind", "elementWildcard",
			   "wildcards", "##other",
			   "name", ":0",
			   "processing", "strict"
		   });
		addAnnotation
		  (labelEClass,
		   source,
		   new String[] {
			   "name", "Label",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getLabel_Bounds(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Bounds",
			   "namespace", "http://www.omg.org/spec/DD/20100524/DC"
		   });
		addAnnotation
		  (labeledEdgeEClass,
		   source,
		   new String[] {
			   "name", "LabeledEdge",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (labeledShapeEClass,
		   source,
		   new String[] {
			   "name", "LabeledShape",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (nodeEClass,
		   source,
		   new String[] {
			   "name", "Node",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (planeEClass,
		   source,
		   new String[] {
			   "name", "Plane",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getPlane_DiagramElementGroup(),
		   source,
		   new String[] {
			   "kind", "group",
			   "name", "DiagramElement:group",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getPlane_DiagramElement(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DiagramElement",
			   "namespace", "##targetNamespace",
			   "group", "DiagramElement:group"
		   });
		addAnnotation
		  (shapeEClass,
		   source,
		   new String[] {
			   "name", "Shape",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getShape_Bounds(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Bounds",
			   "namespace", "http://www.omg.org/spec/DD/20100524/DC"
		   });
		addAnnotation
		  (styleEClass,
		   source,
		   new String[] {
			   "name", "Style",
			   "kind", "empty"
		   });
		addAnnotation
		  (getStyle_Id(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "id"
		   });
		addAnnotation
		  (diRootEClass,
		   source,
		   new String[] {
			   "name", "",
			   "kind", "mixed"
		   });
		addAnnotation
		  (getDIRoot_Mixed(),
		   source,
		   new String[] {
			   "kind", "elementWildcard",
			   "name", ":mixed"
		   });
		addAnnotation
		  (getDIRoot_XMLNSPrefixMap(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "xmlns:prefix"
		   });
		addAnnotation
		  (getDIRoot_XSISchemaLocation(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "xsi:schemaLocation"
		   });
		addAnnotation
		  (getDIRoot_DiagramElement(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DiagramElement",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDIRoot_Diagram(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Diagram",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDIRoot_Edge(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Edge",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDIRoot_Label(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Label",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDIRoot_LabeledEdge(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "LabeledEdge",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDIRoot_LabeledShape(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "LabeledShape",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDIRoot_Node(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Node",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDIRoot_Plane(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Plane",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDIRoot_Shape(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Shape",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDIRoot_Style(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Style",
			   "namespace", "##targetNamespace"
		   });
	}

} //DIPackageImpl
