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
package de.xoev.xfamilie.geburt._1.geburt;

import de.xoev.xfamilie.baukasten._1.baukasten.AntragsnachrichtType;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sorge Nachweisregister Eintragung0804 Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.geburt._1.geburt.SorgeNachweisregisterEintragung0804Type#getAngabenZurMutter <em>Angaben Zur Mutter</em>}</li>
 *   <li>{@link de.xoev.xfamilie.geburt._1.geburt.SorgeNachweisregisterEintragung0804Type#getAngabenZumKind <em>Angaben Zum Kind</em>}</li>
 *   <li>{@link de.xoev.xfamilie.geburt._1.geburt.SorgeNachweisregisterEintragung0804Type#getEintragungNachweisregister <em>Eintragung Nachweisregister</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.geburt._1.geburt.GeburtPackage#getSorgeNachweisregisterEintragung0804Type()
 * @model extendedMetaData="name='sorge.nachweisregister.eintragung.0804_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface SorgeNachweisregisterEintragung0804Type extends AntragsnachrichtType {
	/**
	 * Returns the value of the '<em><b>Angaben Zur Mutter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Mutter des Kindes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Angaben Zur Mutter</em>' containment reference.
	 * @see #setAngabenZurMutter(AngabenZumElternteil2Type)
	 * @see de.xoev.xfamilie.geburt._1.geburt.GeburtPackage#getSorgeNachweisregisterEintragung0804Type_AngabenZurMutter()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='angabenZurMutter' namespace='##targetNamespace'"
	 * @generated
	 */
	AngabenZumElternteil2Type getAngabenZurMutter();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.geburt._1.geburt.SorgeNachweisregisterEintragung0804Type#getAngabenZurMutter <em>Angaben Zur Mutter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Angaben Zur Mutter</em>' containment reference.
	 * @see #getAngabenZurMutter()
	 * @generated
	 */
	void setAngabenZurMutter(AngabenZumElternteil2Type value);

	/**
	 * Returns the value of the '<em><b>Angaben Zum Kind</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Kind, zu dem Eintragungen im Nachweisregister vorgenommen werden.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Angaben Zum Kind</em>' containment reference.
	 * @see #setAngabenZumKind(AngabenZumKindType)
	 * @see de.xoev.xfamilie.geburt._1.geburt.GeburtPackage#getSorgeNachweisregisterEintragung0804Type_AngabenZumKind()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='angabenZumKind' namespace='##targetNamespace'"
	 * @generated
	 */
	AngabenZumKindType getAngabenZumKind();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.geburt._1.geburt.SorgeNachweisregisterEintragung0804Type#getAngabenZumKind <em>Angaben Zum Kind</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Angaben Zum Kind</em>' containment reference.
	 * @see #getAngabenZumKind()
	 * @generated
	 */
	void setAngabenZumKind(AngabenZumKindType value);

	/**
	 * Returns the value of the '<em><b>Eintragung Nachweisregister</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angaben zur Eintragung im Sorgeregister.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Eintragung Nachweisregister</em>' containment reference.
	 * @see #setEintragungNachweisregister(EintragungNachweisregisterType)
	 * @see de.xoev.xfamilie.geburt._1.geburt.GeburtPackage#getSorgeNachweisregisterEintragung0804Type_EintragungNachweisregister()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='eintragungNachweisregister' namespace='##targetNamespace'"
	 * @generated
	 */
	EintragungNachweisregisterType getEintragungNachweisregister();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.geburt._1.geburt.SorgeNachweisregisterEintragung0804Type#getEintragungNachweisregister <em>Eintragung Nachweisregister</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Eintragung Nachweisregister</em>' containment reference.
	 * @see #getEintragungNachweisregister()
	 * @generated
	 */
	void setEintragungNachweisregister(EintragungNachweisregisterType value);

} // SorgeNachweisregisterEintragung0804Type
