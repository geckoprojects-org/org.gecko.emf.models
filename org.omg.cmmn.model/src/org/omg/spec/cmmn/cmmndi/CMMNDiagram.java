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

import javax.xml.namespace.QName;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.util.FeatureMap;

import org.omg.spec.cmmn.dc.Dimension;

import org.omg.spec.cmmn.di.Diagram;
import org.omg.spec.cmmn.di.DiagramElement;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CMMN Diagram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.spec.cmmn.cmmndi.CMMNDiagram#getSize <em>Size</em>}</li>
 *   <li>{@link org.omg.spec.cmmn.cmmndi.CMMNDiagram#getCMMNDiagramElementGroup <em>CMMN Diagram Element Group</em>}</li>
 *   <li>{@link org.omg.spec.cmmn.cmmndi.CMMNDiagram#getCMMNDiagramElement <em>CMMN Diagram Element</em>}</li>
 *   <li>{@link org.omg.spec.cmmn.cmmndi.CMMNDiagram#getCmmnElementRef <em>Cmmn Element Ref</em>}</li>
 * </ul>
 *
 * @see org.omg.spec.cmmn.cmmndi.CMMNDIPackage#getCMMNDiagram()
 * @model extendedMetaData="name='CMMNDiagram' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface CMMNDiagram extends Diagram {
	/**
	 * Returns the value of the '<em><b>Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' containment reference.
	 * @see #setSize(Dimension)
	 * @see org.omg.spec.cmmn.cmmndi.CMMNDIPackage#getCMMNDiagram_Size()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Size' namespace='##targetNamespace'"
	 * @generated
	 */
	Dimension getSize();

	/**
	 * Sets the value of the '{@link org.omg.spec.cmmn.cmmndi.CMMNDiagram#getSize <em>Size</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' containment reference.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(Dimension value);

	/**
	 * Returns the value of the '<em><b>CMMN Diagram Element Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This element should never be instantiated directly, but rather concrete implementation should. It is placed there only to be referred in the sequence
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>CMMN Diagram Element Group</em>' attribute list.
	 * @see org.omg.spec.cmmn.cmmndi.CMMNDIPackage#getCMMNDiagram_CMMNDiagramElementGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='CMMNDiagramElement:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getCMMNDiagramElementGroup();

	/**
	 * Returns the value of the '<em><b>CMMN Diagram Element</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.spec.cmmn.di.DiagramElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This element should never be instantiated directly, but rather concrete implementation should. It is placed there only to be referred in the sequence
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>CMMN Diagram Element</em>' containment reference list.
	 * @see org.omg.spec.cmmn.cmmndi.CMMNDIPackage#getCMMNDiagram_CMMNDiagramElement()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='CMMNDiagramElement' namespace='##targetNamespace' group='CMMNDiagramElement:group'"
	 * @generated
	 */
	EList<DiagramElement> getCMMNDiagramElement();

	/**
	 * Returns the value of the '<em><b>Cmmn Element Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cmmn Element Ref</em>' attribute.
	 * @see #setCmmnElementRef(QName)
	 * @see org.omg.spec.cmmn.cmmndi.CMMNDIPackage#getCMMNDiagram_CmmnElementRef()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.QName"
	 *        extendedMetaData="kind='attribute' name='cmmnElementRef'"
	 * @generated
	 */
	QName getCmmnElementRef();

	/**
	 * Sets the value of the '{@link org.omg.spec.cmmn.cmmndi.CMMNDiagram#getCmmnElementRef <em>Cmmn Element Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cmmn Element Ref</em>' attribute.
	 * @see #getCmmnElementRef()
	 * @generated
	 */
	void setCmmnElementRef(QName value);

} // CMMNDiagram
