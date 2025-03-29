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

import org.omg.spec.cmmn.di.Edge;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CMMN Edge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.spec.cmmn.cmmndi.CMMNEdge#getCMMNLabel <em>CMMN Label</em>}</li>
 *   <li>{@link org.omg.spec.cmmn.cmmndi.CMMNEdge#getCmmnElementRef <em>Cmmn Element Ref</em>}</li>
 *   <li>{@link org.omg.spec.cmmn.cmmndi.CMMNEdge#isIsStandardEventVisible <em>Is Standard Event Visible</em>}</li>
 *   <li>{@link org.omg.spec.cmmn.cmmndi.CMMNEdge#getSourceCMMNElementRef <em>Source CMMN Element Ref</em>}</li>
 *   <li>{@link org.omg.spec.cmmn.cmmndi.CMMNEdge#getTargetCMMNElementRef <em>Target CMMN Element Ref</em>}</li>
 * </ul>
 *
 * @see org.omg.spec.cmmn.cmmndi.CMMNDIPackage#getCMMNEdge()
 * @model extendedMetaData="name='CMMNEdge' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface CMMNEdge extends Edge {
	/**
	 * Returns the value of the '<em><b>CMMN Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CMMN Label</em>' containment reference.
	 * @see #setCMMNLabel(CMMNLabel)
	 * @see org.omg.spec.cmmn.cmmndi.CMMNDIPackage#getCMMNEdge_CMMNLabel()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='CMMNLabel' namespace='##targetNamespace'"
	 * @generated
	 */
	CMMNLabel getCMMNLabel();

	/**
	 * Sets the value of the '{@link org.omg.spec.cmmn.cmmndi.CMMNEdge#getCMMNLabel <em>CMMN Label</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CMMN Label</em>' containment reference.
	 * @see #getCMMNLabel()
	 * @generated
	 */
	void setCMMNLabel(CMMNLabel value);

	/**
	 * Returns the value of the '<em><b>Cmmn Element Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cmmn Element Ref</em>' attribute.
	 * @see #setCmmnElementRef(QName)
	 * @see org.omg.spec.cmmn.cmmndi.CMMNDIPackage#getCMMNEdge_CmmnElementRef()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.QName"
	 *        extendedMetaData="kind='attribute' name='cmmnElementRef'"
	 * @generated
	 */
	QName getCmmnElementRef();

	/**
	 * Sets the value of the '{@link org.omg.spec.cmmn.cmmndi.CMMNEdge#getCmmnElementRef <em>Cmmn Element Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cmmn Element Ref</em>' attribute.
	 * @see #getCmmnElementRef()
	 * @generated
	 */
	void setCmmnElementRef(QName value);

	/**
	 * Returns the value of the '<em><b>Is Standard Event Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Standard Event Visible</em>' attribute.
	 * @see #isSetIsStandardEventVisible()
	 * @see #unsetIsStandardEventVisible()
	 * @see #setIsStandardEventVisible(boolean)
	 * @see org.omg.spec.cmmn.cmmndi.CMMNDIPackage#getCMMNEdge_IsStandardEventVisible()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='isStandardEventVisible'"
	 * @generated
	 */
	boolean isIsStandardEventVisible();

	/**
	 * Sets the value of the '{@link org.omg.spec.cmmn.cmmndi.CMMNEdge#isIsStandardEventVisible <em>Is Standard Event Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Standard Event Visible</em>' attribute.
	 * @see #isSetIsStandardEventVisible()
	 * @see #unsetIsStandardEventVisible()
	 * @see #isIsStandardEventVisible()
	 * @generated
	 */
	void setIsStandardEventVisible(boolean value);

	/**
	 * Unsets the value of the '{@link org.omg.spec.cmmn.cmmndi.CMMNEdge#isIsStandardEventVisible <em>Is Standard Event Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsStandardEventVisible()
	 * @see #isIsStandardEventVisible()
	 * @see #setIsStandardEventVisible(boolean)
	 * @generated
	 */
	void unsetIsStandardEventVisible();

	/**
	 * Returns whether the value of the '{@link org.omg.spec.cmmn.cmmndi.CMMNEdge#isIsStandardEventVisible <em>Is Standard Event Visible</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Standard Event Visible</em>' attribute is set.
	 * @see #unsetIsStandardEventVisible()
	 * @see #isIsStandardEventVisible()
	 * @see #setIsStandardEventVisible(boolean)
	 * @generated
	 */
	boolean isSetIsStandardEventVisible();

	/**
	 * Returns the value of the '<em><b>Source CMMN Element Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source CMMN Element Ref</em>' attribute.
	 * @see #setSourceCMMNElementRef(QName)
	 * @see org.omg.spec.cmmn.cmmndi.CMMNDIPackage#getCMMNEdge_SourceCMMNElementRef()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.QName"
	 *        extendedMetaData="kind='attribute' name='sourceCMMNElementRef'"
	 * @generated
	 */
	QName getSourceCMMNElementRef();

	/**
	 * Sets the value of the '{@link org.omg.spec.cmmn.cmmndi.CMMNEdge#getSourceCMMNElementRef <em>Source CMMN Element Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source CMMN Element Ref</em>' attribute.
	 * @see #getSourceCMMNElementRef()
	 * @generated
	 */
	void setSourceCMMNElementRef(QName value);

	/**
	 * Returns the value of the '<em><b>Target CMMN Element Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target CMMN Element Ref</em>' attribute.
	 * @see #setTargetCMMNElementRef(QName)
	 * @see org.omg.spec.cmmn.cmmndi.CMMNDIPackage#getCMMNEdge_TargetCMMNElementRef()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.QName"
	 *        extendedMetaData="kind='attribute' name='targetCMMNElementRef'"
	 * @generated
	 */
	QName getTargetCMMNElementRef();

	/**
	 * Sets the value of the '{@link org.omg.spec.cmmn.cmmndi.CMMNEdge#getTargetCMMNElementRef <em>Target CMMN Element Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target CMMN Element Ref</em>' attribute.
	 * @see #getTargetCMMNElementRef()
	 * @generated
	 */
	void setTargetCMMNElementRef(QName value);

} // CMMNEdge
