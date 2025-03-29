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

import javax.xml.namespace.QName;

import org.omg.spec.dmn.di.Edge;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DMN Edge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.spec.dmn.dmndi.DMNEdge#getDMNLabel <em>DMN Label</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmndi.DMNEdge#getDmnElementRef <em>Dmn Element Ref</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmndi.DMNEdge#getSourceElement <em>Source Element</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmndi.DMNEdge#getTargetElement <em>Target Element</em>}</li>
 * </ul>
 *
 * @see org.omg.spec.dmn.dmndi.DMNDIPackage#getDMNEdge()
 * @model extendedMetaData="name='DMNEdge' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface DMNEdge extends Edge {
	/**
	 * Returns the value of the '<em><b>DMN Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DMN Label</em>' containment reference.
	 * @see #setDMNLabel(DMNLabel)
	 * @see org.omg.spec.dmn.dmndi.DMNDIPackage#getDMNEdge_DMNLabel()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DMNLabel' namespace='##targetNamespace'"
	 * @generated
	 */
	DMNLabel getDMNLabel();

	/**
	 * Sets the value of the '{@link org.omg.spec.dmn.dmndi.DMNEdge#getDMNLabel <em>DMN Label</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DMN Label</em>' containment reference.
	 * @see #getDMNLabel()
	 * @generated
	 */
	void setDMNLabel(DMNLabel value);

	/**
	 * Returns the value of the '<em><b>Dmn Element Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dmn Element Ref</em>' attribute.
	 * @see #setDmnElementRef(QName)
	 * @see org.omg.spec.dmn.dmndi.DMNDIPackage#getDMNEdge_DmnElementRef()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.QName" required="true"
	 *        extendedMetaData="kind='attribute' name='dmnElementRef'"
	 * @generated
	 */
	QName getDmnElementRef();

	/**
	 * Sets the value of the '{@link org.omg.spec.dmn.dmndi.DMNEdge#getDmnElementRef <em>Dmn Element Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dmn Element Ref</em>' attribute.
	 * @see #getDmnElementRef()
	 * @generated
	 */
	void setDmnElementRef(QName value);

	/**
	 * Returns the value of the '<em><b>Source Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Element</em>' attribute.
	 * @see #setSourceElement(QName)
	 * @see org.omg.spec.dmn.dmndi.DMNDIPackage#getDMNEdge_SourceElement()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.QName"
	 *        extendedMetaData="kind='attribute' name='sourceElement'"
	 * @generated
	 */
	QName getSourceElement();

	/**
	 * Sets the value of the '{@link org.omg.spec.dmn.dmndi.DMNEdge#getSourceElement <em>Source Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Element</em>' attribute.
	 * @see #getSourceElement()
	 * @generated
	 */
	void setSourceElement(QName value);

	/**
	 * Returns the value of the '<em><b>Target Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Element</em>' attribute.
	 * @see #setTargetElement(QName)
	 * @see org.omg.spec.dmn.dmndi.DMNDIPackage#getDMNEdge_TargetElement()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.QName"
	 *        extendedMetaData="kind='attribute' name='targetElement'"
	 * @generated
	 */
	QName getTargetElement();

	/**
	 * Sets the value of the '{@link org.omg.spec.dmn.dmndi.DMNEdge#getTargetElement <em>Target Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Element</em>' attribute.
	 * @see #getTargetElement()
	 * @generated
	 */
	void setTargetElement(QName value);

} // DMNEdge
