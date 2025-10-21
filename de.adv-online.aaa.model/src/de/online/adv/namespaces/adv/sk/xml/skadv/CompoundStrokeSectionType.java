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
 * A representation of the model object '<em><b>Compound Stroke Section Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.CompoundStrokeSectionType#getLength <em>Length</em>}</li>
 * </ul>
 *
 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getCompoundStrokeSectionType()
 * @model abstract="true"
 *        extendedMetaData="name='CompoundStrokeSectionType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface CompoundStrokeSectionType extends EObject {
	/**
	 * Returns the value of the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Länge des jeweiligen Abschnitts in Einheiten entsprechend "mapLengthFactor" (Default in mm/100). 
	 * 
	 * "length" muss größer oder gleich 0 sein. Wird das Property weggelassen, so wird sein Wert als 0 angenommen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Length</em>' attribute.
	 * @see #isSetLength()
	 * @see #unsetLength()
	 * @see #setLength(double)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getCompoundStrokeSectionType_Length()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double"
	 *        extendedMetaData="kind='element' name='length' namespace='##targetNamespace'"
	 * @generated
	 */
	double getLength();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.CompoundStrokeSectionType#getLength <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Length</em>' attribute.
	 * @see #isSetLength()
	 * @see #unsetLength()
	 * @see #getLength()
	 * @generated
	 */
	void setLength(double value);

	/**
	 * Unsets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.CompoundStrokeSectionType#getLength <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLength()
	 * @see #getLength()
	 * @see #setLength(double)
	 * @generated
	 */
	void unsetLength();

	/**
	 * Returns whether the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.CompoundStrokeSectionType#getLength <em>Length</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Length</em>' attribute is set.
	 * @see #unsetLength()
	 * @see #getLength()
	 * @see #setLength(double)
	 * @generated
	 */
	boolean isSetLength();

} // CompoundStrokeSectionType
