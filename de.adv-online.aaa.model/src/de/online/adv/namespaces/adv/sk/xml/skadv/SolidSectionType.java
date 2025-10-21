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
package de.online.adv.namespaces.adv.sk.xml.skadv;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Solid Section Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.SolidSectionType#getStroke <em>Stroke</em>}</li>
 * </ul>
 *
 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getSolidSectionType()
 * @model extendedMetaData="name='SolidSectionType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface SolidSectionType extends CompoundStrokeSectionType {
	/**
	 * Returns the value of the '<em><b>Stroke</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stroke</em>' containment reference.
	 * @see #setStroke(StrokeType4)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getSolidSectionType_Stroke()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='stroke' namespace='##targetNamespace'"
	 * @generated
	 */
	StrokeType4 getStroke();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.SolidSectionType#getStroke <em>Stroke</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stroke</em>' containment reference.
	 * @see #getStroke()
	 * @generated
	 */
	void setStroke(StrokeType4 value);

} // SolidSectionType
