/*
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
package org.omg.spec.dmn.dmndi;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

import org.omg.spec.dmn.di.DiagramElement;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.spec.dmn.dmndi.DMNDIRoot#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmndi.DMNDIRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmndi.DMNDIRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmndi.DMNDIRoot#getDMNDecisionServiceDividerLine <em>DMN Decision Service Divider Line</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmndi.DMNDIRoot#getDMNDI <em>DMNDI</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmndi.DMNDIRoot#getDMNDiagram <em>DMN Diagram</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmndi.DMNDIRoot#getDMNDiagramElement <em>DMN Diagram Element</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmndi.DMNDIRoot#getDMNEdge <em>DMN Edge</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmndi.DMNDIRoot#getDMNLabel <em>DMN Label</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmndi.DMNDIRoot#getDMNShape <em>DMN Shape</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmndi.DMNDIRoot#getDMNStyle <em>DMN Style</em>}</li>
 * </ul>
 *
 * @see org.omg.spec.dmn.dmndi.DMNDIPackage#getDMNDIRoot()
 * @model extendedMetaData="name='' kind='mixed'"
 * @generated
 */
@ProviderType
public interface DMNDIRoot extends EObject {
	/**
	 * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mixed</em>' attribute list.
	 * @see org.omg.spec.dmn.dmndi.DMNDIPackage#getDMNDIRoot_Mixed()
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
	 * @see org.omg.spec.dmn.dmndi.DMNDIPackage#getDMNDIRoot_XMLNSPrefixMap()
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
	 * @see org.omg.spec.dmn.dmndi.DMNDIPackage#getDMNDIRoot_XSISchemaLocation()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry&lt;org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString&gt;" transient="true"
	 *        extendedMetaData="kind='attribute' name='xsi:schemaLocation'"
	 * @generated
	 */
	EMap<String, String> getXSISchemaLocation();

	/**
	 * Returns the value of the '<em><b>DMN Decision Service Divider Line</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DMN Decision Service Divider Line</em>' containment reference.
	 * @see #setDMNDecisionServiceDividerLine(DMNDecisionServiceDividerLine)
	 * @see org.omg.spec.dmn.dmndi.DMNDIPackage#getDMNDIRoot_DMNDecisionServiceDividerLine()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DMNDecisionServiceDividerLine' namespace='##targetNamespace'"
	 * @generated
	 */
	DMNDecisionServiceDividerLine getDMNDecisionServiceDividerLine();

	/**
	 * Sets the value of the '{@link org.omg.spec.dmn.dmndi.DMNDIRoot#getDMNDecisionServiceDividerLine <em>DMN Decision Service Divider Line</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DMN Decision Service Divider Line</em>' containment reference.
	 * @see #getDMNDecisionServiceDividerLine()
	 * @generated
	 */
	void setDMNDecisionServiceDividerLine(DMNDecisionServiceDividerLine value);

	/**
	 * Returns the value of the '<em><b>DMNDI</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DMNDI</em>' containment reference.
	 * @see #setDMNDI(DMNDI)
	 * @see org.omg.spec.dmn.dmndi.DMNDIPackage#getDMNDIRoot_DMNDI()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DMNDI' namespace='##targetNamespace'"
	 * @generated
	 */
	DMNDI getDMNDI();

	/**
	 * Sets the value of the '{@link org.omg.spec.dmn.dmndi.DMNDIRoot#getDMNDI <em>DMNDI</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DMNDI</em>' containment reference.
	 * @see #getDMNDI()
	 * @generated
	 */
	void setDMNDI(DMNDI value);

	/**
	 * Returns the value of the '<em><b>DMN Diagram</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DMN Diagram</em>' containment reference.
	 * @see #setDMNDiagram(DMNDiagram)
	 * @see org.omg.spec.dmn.dmndi.DMNDIPackage#getDMNDIRoot_DMNDiagram()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DMNDiagram' namespace='##targetNamespace'"
	 * @generated
	 */
	DMNDiagram getDMNDiagram();

	/**
	 * Sets the value of the '{@link org.omg.spec.dmn.dmndi.DMNDIRoot#getDMNDiagram <em>DMN Diagram</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DMN Diagram</em>' containment reference.
	 * @see #getDMNDiagram()
	 * @generated
	 */
	void setDMNDiagram(DMNDiagram value);

	/**
	 * Returns the value of the '<em><b>DMN Diagram Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This element should never be instantiated directly, but rather concrete implementation should. It is placed there only to be referred in the sequence
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>DMN Diagram Element</em>' containment reference.
	 * @see #setDMNDiagramElement(DiagramElement)
	 * @see org.omg.spec.dmn.dmndi.DMNDIPackage#getDMNDIRoot_DMNDiagramElement()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DMNDiagramElement' namespace='##targetNamespace'"
	 * @generated
	 */
	DiagramElement getDMNDiagramElement();

	/**
	 * Sets the value of the '{@link org.omg.spec.dmn.dmndi.DMNDIRoot#getDMNDiagramElement <em>DMN Diagram Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DMN Diagram Element</em>' containment reference.
	 * @see #getDMNDiagramElement()
	 * @generated
	 */
	void setDMNDiagramElement(DiagramElement value);

	/**
	 * Returns the value of the '<em><b>DMN Edge</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DMN Edge</em>' containment reference.
	 * @see #setDMNEdge(DMNEdge)
	 * @see org.omg.spec.dmn.dmndi.DMNDIPackage#getDMNDIRoot_DMNEdge()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DMNEdge' namespace='##targetNamespace' affiliation='DMNDiagramElement'"
	 * @generated
	 */
	DMNEdge getDMNEdge();

	/**
	 * Sets the value of the '{@link org.omg.spec.dmn.dmndi.DMNDIRoot#getDMNEdge <em>DMN Edge</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DMN Edge</em>' containment reference.
	 * @see #getDMNEdge()
	 * @generated
	 */
	void setDMNEdge(DMNEdge value);

	/**
	 * Returns the value of the '<em><b>DMN Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DMN Label</em>' containment reference.
	 * @see #setDMNLabel(DMNLabel)
	 * @see org.omg.spec.dmn.dmndi.DMNDIPackage#getDMNDIRoot_DMNLabel()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DMNLabel' namespace='##targetNamespace'"
	 * @generated
	 */
	DMNLabel getDMNLabel();

	/**
	 * Sets the value of the '{@link org.omg.spec.dmn.dmndi.DMNDIRoot#getDMNLabel <em>DMN Label</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DMN Label</em>' containment reference.
	 * @see #getDMNLabel()
	 * @generated
	 */
	void setDMNLabel(DMNLabel value);

	/**
	 * Returns the value of the '<em><b>DMN Shape</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DMN Shape</em>' containment reference.
	 * @see #setDMNShape(DMNShape)
	 * @see org.omg.spec.dmn.dmndi.DMNDIPackage#getDMNDIRoot_DMNShape()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DMNShape' namespace='##targetNamespace' affiliation='DMNDiagramElement'"
	 * @generated
	 */
	DMNShape getDMNShape();

	/**
	 * Sets the value of the '{@link org.omg.spec.dmn.dmndi.DMNDIRoot#getDMNShape <em>DMN Shape</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DMN Shape</em>' containment reference.
	 * @see #getDMNShape()
	 * @generated
	 */
	void setDMNShape(DMNShape value);

	/**
	 * Returns the value of the '<em><b>DMN Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DMN Style</em>' containment reference.
	 * @see #setDMNStyle(DMNStyle)
	 * @see org.omg.spec.dmn.dmndi.DMNDIPackage#getDMNDIRoot_DMNStyle()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DMNStyle' namespace='##targetNamespace' affiliation='http://www.omg.org/spec/DMN/20180521/DI/#Style'"
	 * @generated
	 */
	DMNStyle getDMNStyle();

	/**
	 * Sets the value of the '{@link org.omg.spec.dmn.dmndi.DMNDIRoot#getDMNStyle <em>DMN Style</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DMN Style</em>' containment reference.
	 * @see #getDMNStyle()
	 * @generated
	 */
	void setDMNStyle(DMNStyle value);

} // DMNDIRoot
