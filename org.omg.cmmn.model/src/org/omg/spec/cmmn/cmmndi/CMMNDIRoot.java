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
package org.omg.spec.cmmn.cmmndi;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

import org.omg.spec.cmmn.di.DiagramElement;

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
 *   <li>{@link org.omg.spec.cmmn.cmmndi.CMMNDIRoot#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.omg.spec.cmmn.cmmndi.CMMNDIRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.omg.spec.cmmn.cmmndi.CMMNDIRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.omg.spec.cmmn.cmmndi.CMMNDIRoot#getCMMNDI <em>CMMNDI</em>}</li>
 *   <li>{@link org.omg.spec.cmmn.cmmndi.CMMNDIRoot#getCMMNDiagram <em>CMMN Diagram</em>}</li>
 *   <li>{@link org.omg.spec.cmmn.cmmndi.CMMNDIRoot#getCMMNDiagramElement <em>CMMN Diagram Element</em>}</li>
 *   <li>{@link org.omg.spec.cmmn.cmmndi.CMMNDIRoot#getCMMNEdge <em>CMMN Edge</em>}</li>
 *   <li>{@link org.omg.spec.cmmn.cmmndi.CMMNDIRoot#getCMMNLabel <em>CMMN Label</em>}</li>
 *   <li>{@link org.omg.spec.cmmn.cmmndi.CMMNDIRoot#getCMMNShape <em>CMMN Shape</em>}</li>
 *   <li>{@link org.omg.spec.cmmn.cmmndi.CMMNDIRoot#getCMMNStyle <em>CMMN Style</em>}</li>
 * </ul>
 *
 * @see org.omg.spec.cmmn.cmmndi.CMMNDIPackage#getCMMNDIRoot()
 * @model extendedMetaData="name='' kind='mixed'"
 * @generated
 */
@ProviderType
public interface CMMNDIRoot extends EObject {
	/**
	 * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mixed</em>' attribute list.
	 * @see org.omg.spec.cmmn.cmmndi.CMMNDIPackage#getCMMNDIRoot_Mixed()
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
	 * @see org.omg.spec.cmmn.cmmndi.CMMNDIPackage#getCMMNDIRoot_XMLNSPrefixMap()
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
	 * @see org.omg.spec.cmmn.cmmndi.CMMNDIPackage#getCMMNDIRoot_XSISchemaLocation()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry&lt;org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString&gt;" transient="true"
	 *        extendedMetaData="kind='attribute' name='xsi:schemaLocation'"
	 * @generated
	 */
	EMap<String, String> getXSISchemaLocation();

	/**
	 * Returns the value of the '<em><b>CMMNDI</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CMMNDI</em>' containment reference.
	 * @see #setCMMNDI(CMMNDI)
	 * @see org.omg.spec.cmmn.cmmndi.CMMNDIPackage#getCMMNDIRoot_CMMNDI()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='CMMNDI' namespace='##targetNamespace'"
	 * @generated
	 */
	CMMNDI getCMMNDI();

	/**
	 * Sets the value of the '{@link org.omg.spec.cmmn.cmmndi.CMMNDIRoot#getCMMNDI <em>CMMNDI</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CMMNDI</em>' containment reference.
	 * @see #getCMMNDI()
	 * @generated
	 */
	void setCMMNDI(CMMNDI value);

	/**
	 * Returns the value of the '<em><b>CMMN Diagram</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CMMN Diagram</em>' containment reference.
	 * @see #setCMMNDiagram(CMMNDiagram)
	 * @see org.omg.spec.cmmn.cmmndi.CMMNDIPackage#getCMMNDIRoot_CMMNDiagram()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='CMMNDiagram' namespace='##targetNamespace'"
	 * @generated
	 */
	CMMNDiagram getCMMNDiagram();

	/**
	 * Sets the value of the '{@link org.omg.spec.cmmn.cmmndi.CMMNDIRoot#getCMMNDiagram <em>CMMN Diagram</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CMMN Diagram</em>' containment reference.
	 * @see #getCMMNDiagram()
	 * @generated
	 */
	void setCMMNDiagram(CMMNDiagram value);

	/**
	 * Returns the value of the '<em><b>CMMN Diagram Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This element should never be instantiated directly, but rather concrete implementation should. It is placed there only to be referred in the sequence
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>CMMN Diagram Element</em>' containment reference.
	 * @see #setCMMNDiagramElement(DiagramElement)
	 * @see org.omg.spec.cmmn.cmmndi.CMMNDIPackage#getCMMNDIRoot_CMMNDiagramElement()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='CMMNDiagramElement' namespace='##targetNamespace'"
	 * @generated
	 */
	DiagramElement getCMMNDiagramElement();

	/**
	 * Sets the value of the '{@link org.omg.spec.cmmn.cmmndi.CMMNDIRoot#getCMMNDiagramElement <em>CMMN Diagram Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CMMN Diagram Element</em>' containment reference.
	 * @see #getCMMNDiagramElement()
	 * @generated
	 */
	void setCMMNDiagramElement(DiagramElement value);

	/**
	 * Returns the value of the '<em><b>CMMN Edge</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CMMN Edge</em>' containment reference.
	 * @see #setCMMNEdge(CMMNEdge)
	 * @see org.omg.spec.cmmn.cmmndi.CMMNDIPackage#getCMMNDIRoot_CMMNEdge()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='CMMNEdge' namespace='##targetNamespace' affiliation='CMMNDiagramElement'"
	 * @generated
	 */
	CMMNEdge getCMMNEdge();

	/**
	 * Sets the value of the '{@link org.omg.spec.cmmn.cmmndi.CMMNDIRoot#getCMMNEdge <em>CMMN Edge</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CMMN Edge</em>' containment reference.
	 * @see #getCMMNEdge()
	 * @generated
	 */
	void setCMMNEdge(CMMNEdge value);

	/**
	 * Returns the value of the '<em><b>CMMN Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CMMN Label</em>' containment reference.
	 * @see #setCMMNLabel(CMMNLabel)
	 * @see org.omg.spec.cmmn.cmmndi.CMMNDIPackage#getCMMNDIRoot_CMMNLabel()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='CMMNLabel' namespace='##targetNamespace'"
	 * @generated
	 */
	CMMNLabel getCMMNLabel();

	/**
	 * Sets the value of the '{@link org.omg.spec.cmmn.cmmndi.CMMNDIRoot#getCMMNLabel <em>CMMN Label</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CMMN Label</em>' containment reference.
	 * @see #getCMMNLabel()
	 * @generated
	 */
	void setCMMNLabel(CMMNLabel value);

	/**
	 * Returns the value of the '<em><b>CMMN Shape</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CMMN Shape</em>' containment reference.
	 * @see #setCMMNShape(CMMNShape)
	 * @see org.omg.spec.cmmn.cmmndi.CMMNDIPackage#getCMMNDIRoot_CMMNShape()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='CMMNShape' namespace='##targetNamespace' affiliation='CMMNDiagramElement'"
	 * @generated
	 */
	CMMNShape getCMMNShape();

	/**
	 * Sets the value of the '{@link org.omg.spec.cmmn.cmmndi.CMMNDIRoot#getCMMNShape <em>CMMN Shape</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CMMN Shape</em>' containment reference.
	 * @see #getCMMNShape()
	 * @generated
	 */
	void setCMMNShape(CMMNShape value);

	/**
	 * Returns the value of the '<em><b>CMMN Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CMMN Style</em>' containment reference.
	 * @see #setCMMNStyle(CMMNStyle)
	 * @see org.omg.spec.cmmn.cmmndi.CMMNDIPackage#getCMMNDIRoot_CMMNStyle()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='CMMNStyle' namespace='##targetNamespace' affiliation='http://www.omg.org/spec/CMMN/20151109/DI#Style'"
	 * @generated
	 */
	CMMNStyle getCMMNStyle();

	/**
	 * Sets the value of the '{@link org.omg.spec.cmmn.cmmndi.CMMNDIRoot#getCMMNStyle <em>CMMN Style</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CMMN Style</em>' containment reference.
	 * @see #getCMMNStyle()
	 * @generated
	 */
	void setCMMNStyle(CMMNStyle value);

} // CMMNDIRoot
