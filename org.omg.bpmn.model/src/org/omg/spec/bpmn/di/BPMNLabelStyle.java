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

import org.omg.spec.dd.dc.Font;

import org.omg.spec.dd.di.Style;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BPMN Label Style</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.spec.bpmn.di.BPMNLabelStyle#getFont <em>Font</em>}</li>
 * </ul>
 *
 * @see org.omg.spec.bpmn.di.BPMNDIPackage#getBPMNLabelStyle()
 * @model extendedMetaData="name='BPMNLabelStyle' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface BPMNLabelStyle extends Style {
	/**
	 * Returns the value of the '<em><b>Font</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Font</em>' containment reference.
	 * @see #setFont(Font)
	 * @see org.omg.spec.bpmn.di.BPMNDIPackage#getBPMNLabelStyle_Font()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Font' namespace='http://www.omg.org/spec/DD/20100524/DC'"
	 * @generated
	 */
	Font getFont();

	/**
	 * Sets the value of the '{@link org.omg.spec.bpmn.di.BPMNLabelStyle#getFont <em>Font</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Font</em>' containment reference.
	 * @see #getFont()
	 * @generated
	 */
	void setFont(Font value);

} // BPMNLabelStyle
