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
package org.omg.spec.bpmn.di;

import javax.xml.namespace.QName;

import org.omg.spec.dd.di.Label;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BPMN Label</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.spec.bpmn.di.BPMNLabel#getLabelStyle <em>Label Style</em>}</li>
 * </ul>
 *
 * @see org.omg.spec.bpmn.di.BPMNDIPackage#getBPMNLabel()
 * @model extendedMetaData="name='BPMNLabel' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface BPMNLabel extends Label {
	/**
	 * Returns the value of the '<em><b>Label Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label Style</em>' attribute.
	 * @see #setLabelStyle(QName)
	 * @see org.omg.spec.bpmn.di.BPMNDIPackage#getBPMNLabel_LabelStyle()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.QName"
	 *        extendedMetaData="kind='attribute' name='labelStyle'"
	 * @generated
	 */
	QName getLabelStyle();

	/**
	 * Sets the value of the '{@link org.omg.spec.bpmn.di.BPMNLabel#getLabelStyle <em>Label Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label Style</em>' attribute.
	 * @see #getLabelStyle()
	 * @generated
	 */
	void setLabelStyle(QName value);

} // BPMNLabel
