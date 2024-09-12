/*
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
package org.omg.dd.di;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DI Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.dd.di.DIRoot#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.omg.dd.di.DIRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.omg.dd.di.DIRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.omg.dd.di.DIRoot#getDiagramElement <em>Diagram Element</em>}</li>
 *   <li>{@link org.omg.dd.di.DIRoot#getDiagram <em>Diagram</em>}</li>
 *   <li>{@link org.omg.dd.di.DIRoot#getEdge <em>Edge</em>}</li>
 *   <li>{@link org.omg.dd.di.DIRoot#getLabel <em>Label</em>}</li>
 *   <li>{@link org.omg.dd.di.DIRoot#getLabeledEdge <em>Labeled Edge</em>}</li>
 *   <li>{@link org.omg.dd.di.DIRoot#getLabeledShape <em>Labeled Shape</em>}</li>
 *   <li>{@link org.omg.dd.di.DIRoot#getNode <em>Node</em>}</li>
 *   <li>{@link org.omg.dd.di.DIRoot#getPlane <em>Plane</em>}</li>
 *   <li>{@link org.omg.dd.di.DIRoot#getShape <em>Shape</em>}</li>
 *   <li>{@link org.omg.dd.di.DIRoot#getStyle <em>Style</em>}</li>
 * </ul>
 *
 * @see org.omg.dd.di.DiPackage#getDIRoot()
 * @model extendedMetaData="name='' kind='mixed'"
 * @generated
 */
@ProviderType
public interface DIRoot extends EObject {
	/**
	 * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mixed</em>' attribute list.
	 * @see org.omg.dd.di.DiPackage#getDIRoot_Mixed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' name=':mixed'"
	 * @generated
	 */
	FeatureMap getMixed();

	/**
	 * Returns the value of the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XMLNS Prefix Map</em>' map.
	 * @see org.omg.dd.di.DiPackage#getDIRoot_XMLNSPrefixMap()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry&lt;org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString&gt;" transient="true"
	 *        extendedMetaData="kind='attribute' name='xmlns:prefix'"
	 * @generated
	 */
	EMap<String, String> getXMLNSPrefixMap();

	/**
	 * Returns the value of the '<em><b>XSI Schema Location</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XSI Schema Location</em>' map.
	 * @see org.omg.dd.di.DiPackage#getDIRoot_XSISchemaLocation()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry&lt;org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString&gt;" transient="true"
	 *        extendedMetaData="kind='attribute' name='xsi:schemaLocation'"
	 * @generated
	 */
	EMap<String, String> getXSISchemaLocation();

	/**
	 * Returns the value of the '<em><b>Diagram Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diagram Element</em>' containment reference.
	 * @see #setDiagramElement(DiagramElement)
	 * @see org.omg.dd.di.DiPackage#getDIRoot_DiagramElement()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DiagramElement' namespace='http://www.omg.org/spec/DD/20100524/DI'"
	 * @generated
	 */
	DiagramElement getDiagramElement();

	/**
	 * Sets the value of the '{@link org.omg.dd.di.DIRoot#getDiagramElement <em>Diagram Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diagram Element</em>' containment reference.
	 * @see #getDiagramElement()
	 * @generated
	 */
	void setDiagramElement(DiagramElement value);

	/**
	 * Returns the value of the '<em><b>Diagram</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diagram</em>' containment reference.
	 * @see #setDiagram(Diagram)
	 * @see org.omg.dd.di.DiPackage#getDIRoot_Diagram()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Diagram' namespace='http://www.omg.org/spec/DD/20100524/DI'"
	 * @generated
	 */
	Diagram getDiagram();

	/**
	 * Sets the value of the '{@link org.omg.dd.di.DIRoot#getDiagram <em>Diagram</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diagram</em>' containment reference.
	 * @see #getDiagram()
	 * @generated
	 */
	void setDiagram(Diagram value);

	/**
	 * Returns the value of the '<em><b>Edge</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edge</em>' containment reference.
	 * @see #setEdge(Edge)
	 * @see org.omg.dd.di.DiPackage#getDIRoot_Edge()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Edge' namespace='http://www.omg.org/spec/DD/20100524/DI'"
	 * @generated
	 */
	Edge getEdge();

	/**
	 * Sets the value of the '{@link org.omg.dd.di.DIRoot#getEdge <em>Edge</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Edge</em>' containment reference.
	 * @see #getEdge()
	 * @generated
	 */
	void setEdge(Edge value);

	/**
	 * Returns the value of the '<em><b>Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' containment reference.
	 * @see #setLabel(Label)
	 * @see org.omg.dd.di.DiPackage#getDIRoot_Label()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Label' namespace='http://www.omg.org/spec/DD/20100524/DI'"
	 * @generated
	 */
	Label getLabel();

	/**
	 * Sets the value of the '{@link org.omg.dd.di.DIRoot#getLabel <em>Label</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' containment reference.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(Label value);

	/**
	 * Returns the value of the '<em><b>Labeled Edge</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Labeled Edge</em>' containment reference.
	 * @see #setLabeledEdge(LabeledEdge)
	 * @see org.omg.dd.di.DiPackage#getDIRoot_LabeledEdge()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='LabeledEdge' namespace='http://www.omg.org/spec/DD/20100524/DI'"
	 * @generated
	 */
	LabeledEdge getLabeledEdge();

	/**
	 * Sets the value of the '{@link org.omg.dd.di.DIRoot#getLabeledEdge <em>Labeled Edge</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Labeled Edge</em>' containment reference.
	 * @see #getLabeledEdge()
	 * @generated
	 */
	void setLabeledEdge(LabeledEdge value);

	/**
	 * Returns the value of the '<em><b>Labeled Shape</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Labeled Shape</em>' containment reference.
	 * @see #setLabeledShape(LabeledShape)
	 * @see org.omg.dd.di.DiPackage#getDIRoot_LabeledShape()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='LabeledShape' namespace='http://www.omg.org/spec/DD/20100524/DI'"
	 * @generated
	 */
	LabeledShape getLabeledShape();

	/**
	 * Sets the value of the '{@link org.omg.dd.di.DIRoot#getLabeledShape <em>Labeled Shape</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Labeled Shape</em>' containment reference.
	 * @see #getLabeledShape()
	 * @generated
	 */
	void setLabeledShape(LabeledShape value);

	/**
	 * Returns the value of the '<em><b>Node</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node</em>' containment reference.
	 * @see #setNode(Node)
	 * @see org.omg.dd.di.DiPackage#getDIRoot_Node()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Node' namespace='http://www.omg.org/spec/DD/20100524/DI'"
	 * @generated
	 */
	Node getNode();

	/**
	 * Sets the value of the '{@link org.omg.dd.di.DIRoot#getNode <em>Node</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node</em>' containment reference.
	 * @see #getNode()
	 * @generated
	 */
	void setNode(Node value);

	/**
	 * Returns the value of the '<em><b>Plane</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plane</em>' containment reference.
	 * @see #setPlane(Plane)
	 * @see org.omg.dd.di.DiPackage#getDIRoot_Plane()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Plane' namespace='http://www.omg.org/spec/DD/20100524/DI'"
	 * @generated
	 */
	Plane getPlane();

	/**
	 * Sets the value of the '{@link org.omg.dd.di.DIRoot#getPlane <em>Plane</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Plane</em>' containment reference.
	 * @see #getPlane()
	 * @generated
	 */
	void setPlane(Plane value);

	/**
	 * Returns the value of the '<em><b>Shape</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shape</em>' containment reference.
	 * @see #setShape(Shape)
	 * @see org.omg.dd.di.DiPackage#getDIRoot_Shape()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Shape' namespace='http://www.omg.org/spec/DD/20100524/DI'"
	 * @generated
	 */
	Shape getShape();

	/**
	 * Sets the value of the '{@link org.omg.dd.di.DIRoot#getShape <em>Shape</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shape</em>' containment reference.
	 * @see #getShape()
	 * @generated
	 */
	void setShape(Shape value);

	/**
	 * Returns the value of the '<em><b>Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Style</em>' containment reference.
	 * @see #setStyle(Style)
	 * @see org.omg.dd.di.DiPackage#getDIRoot_Style()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Style' namespace='http://www.omg.org/spec/DD/20100524/DI'"
	 * @generated
	 */
	Style getStyle();

	/**
	 * Sets the value of the '{@link org.omg.dd.di.DIRoot#getStyle <em>Style</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style</em>' containment reference.
	 * @see #getStyle()
	 * @generated
	 */
	void setStyle(Style value);

} // DIRoot
