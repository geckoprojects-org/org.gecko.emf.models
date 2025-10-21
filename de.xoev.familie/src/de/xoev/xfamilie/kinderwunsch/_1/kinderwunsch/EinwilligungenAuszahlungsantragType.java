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
package de.xoev.xfamilie.kinderwunsch._1.kinderwunsch;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Einwilligungen Auszahlungsantrag Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.EinwilligungenAuszahlungsantragType#isZustimmungDatenschutz <em>Zustimmung Datenschutz</em>}</li>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.EinwilligungenAuszahlungsantragType#isElektronischeBescheidzustellung <em>Elektronische Bescheidzustellung</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschPackage#getEinwilligungenAuszahlungsantragType()
 * @model extendedMetaData="name='EinwilligungenAuszahlungsantragType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface EinwilligungenAuszahlungsantragType extends EObject {
	/**
	 * Returns the value of the '<em><b>Zustimmung Datenschutz</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Zustimmung Datenschutz</em>' attribute.
	 * @see #isSetZustimmungDatenschutz()
	 * @see #unsetZustimmungDatenschutz()
	 * @see #setZustimmungDatenschutz(boolean)
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschPackage#getEinwilligungenAuszahlungsantragType_ZustimmungDatenschutz()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='element' name='zustimmungDatenschutz' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isZustimmungDatenschutz();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.EinwilligungenAuszahlungsantragType#isZustimmungDatenschutz <em>Zustimmung Datenschutz</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zustimmung Datenschutz</em>' attribute.
	 * @see #isSetZustimmungDatenschutz()
	 * @see #unsetZustimmungDatenschutz()
	 * @see #isZustimmungDatenschutz()
	 * @generated
	 */
	void setZustimmungDatenschutz(boolean value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.EinwilligungenAuszahlungsantragType#isZustimmungDatenschutz <em>Zustimmung Datenschutz</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetZustimmungDatenschutz()
	 * @see #isZustimmungDatenschutz()
	 * @see #setZustimmungDatenschutz(boolean)
	 * @generated
	 */
	void unsetZustimmungDatenschutz();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.EinwilligungenAuszahlungsantragType#isZustimmungDatenschutz <em>Zustimmung Datenschutz</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Zustimmung Datenschutz</em>' attribute is set.
	 * @see #unsetZustimmungDatenschutz()
	 * @see #isZustimmungDatenschutz()
	 * @see #setZustimmungDatenschutz(boolean)
	 * @generated
	 */
	boolean isSetZustimmungDatenschutz();

	/**
	 * Returns the value of the '<em><b>Elektronische Bescheidzustellung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elektronische Bescheidzustellung</em>' attribute.
	 * @see #isSetElektronischeBescheidzustellung()
	 * @see #unsetElektronischeBescheidzustellung()
	 * @see #setElektronischeBescheidzustellung(boolean)
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschPackage#getEinwilligungenAuszahlungsantragType_ElektronischeBescheidzustellung()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='element' name='elektronischeBescheidzustellung' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isElektronischeBescheidzustellung();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.EinwilligungenAuszahlungsantragType#isElektronischeBescheidzustellung <em>Elektronische Bescheidzustellung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Elektronische Bescheidzustellung</em>' attribute.
	 * @see #isSetElektronischeBescheidzustellung()
	 * @see #unsetElektronischeBescheidzustellung()
	 * @see #isElektronischeBescheidzustellung()
	 * @generated
	 */
	void setElektronischeBescheidzustellung(boolean value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.EinwilligungenAuszahlungsantragType#isElektronischeBescheidzustellung <em>Elektronische Bescheidzustellung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetElektronischeBescheidzustellung()
	 * @see #isElektronischeBescheidzustellung()
	 * @see #setElektronischeBescheidzustellung(boolean)
	 * @generated
	 */
	void unsetElektronischeBescheidzustellung();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.EinwilligungenAuszahlungsantragType#isElektronischeBescheidzustellung <em>Elektronische Bescheidzustellung</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Elektronische Bescheidzustellung</em>' attribute is set.
	 * @see #unsetElektronischeBescheidzustellung()
	 * @see #isElektronischeBescheidzustellung()
	 * @see #setElektronischeBescheidzustellung(boolean)
	 * @generated
	 */
	boolean isSetElektronischeBescheidzustellung();

} // EinwilligungenAuszahlungsantragType
