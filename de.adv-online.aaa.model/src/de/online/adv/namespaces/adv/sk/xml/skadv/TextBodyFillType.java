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

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Text Body Fill Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.TextBodyFillType#getSolidFill <em>Solid Fill</em>}</li>
 * </ul>
 *
 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getTextBodyFillType()
 * @model extendedMetaData="name='textBodyFill_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface TextBodyFillType extends EObject {
	/**
	 * Returns the value of the '<em><b>Solid Fill</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * SolidFill steht für Flächenfüllungen mit einer einheitlichen Farbe.
	 * 
	 * Die Anbindung der Farbe (color) unterliegt der "qualifizierten Assoziation" nach Style.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Solid Fill</em>' containment reference.
	 * @see #setSolidFill(SolidFillType)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getTextBodyFillType_SolidFill()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='SolidFill' namespace='##targetNamespace'"
	 * @generated
	 */
	SolidFillType getSolidFill();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.TextBodyFillType#getSolidFill <em>Solid Fill</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Solid Fill</em>' containment reference.
	 * @see #getSolidFill()
	 * @generated
	 */
	void setSolidFill(SolidFillType value);

} // TextBodyFillType
