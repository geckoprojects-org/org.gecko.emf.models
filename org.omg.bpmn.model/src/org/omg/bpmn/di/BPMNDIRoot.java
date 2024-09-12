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
package org.omg.bpmn.di;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BPMNDI Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.bpmn.di.BPMNDIRoot#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.omg.bpmn.di.BPMNDIRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.omg.bpmn.di.BPMNDIRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.omg.bpmn.di.BPMNDIRoot#getBPMNDiagram <em>BPMN Diagram</em>}</li>
 *   <li>{@link org.omg.bpmn.di.BPMNDIRoot#getBPMNEdge <em>BPMN Edge</em>}</li>
 *   <li>{@link org.omg.bpmn.di.BPMNDIRoot#getBPMNLabel <em>BPMN Label</em>}</li>
 *   <li>{@link org.omg.bpmn.di.BPMNDIRoot#getBPMNLabelStyle <em>BPMN Label Style</em>}</li>
 *   <li>{@link org.omg.bpmn.di.BPMNDIRoot#getBPMNPlane <em>BPMN Plane</em>}</li>
 *   <li>{@link org.omg.bpmn.di.BPMNDIRoot#getBPMNShape <em>BPMN Shape</em>}</li>
 * </ul>
 *
 * @see org.omg.bpmn.di.BpmnDiPackage#getBPMNDIRoot()
 * @model extendedMetaData="name='' kind='mixed'"
 * @generated
 */
@ProviderType
public interface BPMNDIRoot extends EObject {
	/**
	 * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mixed</em>' attribute list.
	 * @see org.omg.bpmn.di.BpmnDiPackage#getBPMNDIRoot_Mixed()
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
	 * @see org.omg.bpmn.di.BpmnDiPackage#getBPMNDIRoot_XMLNSPrefixMap()
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
	 * @see org.omg.bpmn.di.BpmnDiPackage#getBPMNDIRoot_XSISchemaLocation()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry&lt;org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString&gt;" transient="true"
	 *        extendedMetaData="kind='attribute' name='xsi:schemaLocation'"
	 * @generated
	 */
	EMap<String, String> getXSISchemaLocation();

	/**
	 * Returns the value of the '<em><b>BPMN Diagram</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>BPMN Diagram</em>' containment reference.
	 * @see #setBPMNDiagram(BPMNDiagram)
	 * @see org.omg.bpmn.di.BpmnDiPackage#getBPMNDIRoot_BPMNDiagram()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='BPMNDiagram' namespace='http://www.omg.org/spec/BPMN/20100524/DI'"
	 * @generated
	 */
	BPMNDiagram getBPMNDiagram();

	/**
	 * Sets the value of the '{@link org.omg.bpmn.di.BPMNDIRoot#getBPMNDiagram <em>BPMN Diagram</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>BPMN Diagram</em>' containment reference.
	 * @see #getBPMNDiagram()
	 * @generated
	 */
	void setBPMNDiagram(BPMNDiagram value);

	/**
	 * Returns the value of the '<em><b>BPMN Edge</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>BPMN Edge</em>' containment reference.
	 * @see #setBPMNEdge(BPMNEdge)
	 * @see org.omg.bpmn.di.BpmnDiPackage#getBPMNDIRoot_BPMNEdge()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='BPMNEdge' namespace='http://www.omg.org/spec/BPMN/20100524/DI' affiliation='http://www.omg.org/spec/DD/20100524/DI#DiagramElement'"
	 * @generated
	 */
	BPMNEdge getBPMNEdge();

	/**
	 * Sets the value of the '{@link org.omg.bpmn.di.BPMNDIRoot#getBPMNEdge <em>BPMN Edge</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>BPMN Edge</em>' containment reference.
	 * @see #getBPMNEdge()
	 * @generated
	 */
	void setBPMNEdge(BPMNEdge value);

	/**
	 * Returns the value of the '<em><b>BPMN Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>BPMN Label</em>' containment reference.
	 * @see #setBPMNLabel(BPMNLabel)
	 * @see org.omg.bpmn.di.BpmnDiPackage#getBPMNDIRoot_BPMNLabel()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='BPMNLabel' namespace='http://www.omg.org/spec/BPMN/20100524/DI'"
	 * @generated
	 */
	BPMNLabel getBPMNLabel();

	/**
	 * Sets the value of the '{@link org.omg.bpmn.di.BPMNDIRoot#getBPMNLabel <em>BPMN Label</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>BPMN Label</em>' containment reference.
	 * @see #getBPMNLabel()
	 * @generated
	 */
	void setBPMNLabel(BPMNLabel value);

	/**
	 * Returns the value of the '<em><b>BPMN Label Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>BPMN Label Style</em>' containment reference.
	 * @see #setBPMNLabelStyle(BPMNLabelStyle)
	 * @see org.omg.bpmn.di.BpmnDiPackage#getBPMNDIRoot_BPMNLabelStyle()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='BPMNLabelStyle' namespace='http://www.omg.org/spec/BPMN/20100524/DI'"
	 * @generated
	 */
	BPMNLabelStyle getBPMNLabelStyle();

	/**
	 * Sets the value of the '{@link org.omg.bpmn.di.BPMNDIRoot#getBPMNLabelStyle <em>BPMN Label Style</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>BPMN Label Style</em>' containment reference.
	 * @see #getBPMNLabelStyle()
	 * @generated
	 */
	void setBPMNLabelStyle(BPMNLabelStyle value);

	/**
	 * Returns the value of the '<em><b>BPMN Plane</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>BPMN Plane</em>' containment reference.
	 * @see #setBPMNPlane(BPMNPlane)
	 * @see org.omg.bpmn.di.BpmnDiPackage#getBPMNDIRoot_BPMNPlane()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='BPMNPlane' namespace='http://www.omg.org/spec/BPMN/20100524/DI'"
	 * @generated
	 */
	BPMNPlane getBPMNPlane();

	/**
	 * Sets the value of the '{@link org.omg.bpmn.di.BPMNDIRoot#getBPMNPlane <em>BPMN Plane</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>BPMN Plane</em>' containment reference.
	 * @see #getBPMNPlane()
	 * @generated
	 */
	void setBPMNPlane(BPMNPlane value);

	/**
	 * Returns the value of the '<em><b>BPMN Shape</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>BPMN Shape</em>' containment reference.
	 * @see #setBPMNShape(BPMNShape)
	 * @see org.omg.bpmn.di.BpmnDiPackage#getBPMNDIRoot_BPMNShape()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='BPMNShape' namespace='http://www.omg.org/spec/BPMN/20100524/DI' affiliation='http://www.omg.org/spec/DD/20100524/DI#DiagramElement'"
	 * @generated
	 */
	BPMNShape getBPMNShape();

	/**
	 * Sets the value of the '{@link org.omg.bpmn.di.BPMNDIRoot#getBPMNShape <em>BPMN Shape</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>BPMN Shape</em>' containment reference.
	 * @see #getBPMNShape()
	 * @generated
	 */
	void setBPMNShape(BPMNShape value);

} // BPMNDIRoot
