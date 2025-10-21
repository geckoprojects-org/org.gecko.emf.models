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
 * A representation of the model object '<em><b>Sorge Nachweisregister Korrektur0805 Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.geburt._1.geburt.SorgeNachweisregisterKorrektur0805Type#getAngabenZurMutterAlt <em>Angaben Zur Mutter Alt</em>}</li>
 *   <li>{@link de.xoev.xfamilie.geburt._1.geburt.SorgeNachweisregisterKorrektur0805Type#getAngabenZumKindAlt <em>Angaben Zum Kind Alt</em>}</li>
 *   <li>{@link de.xoev.xfamilie.geburt._1.geburt.SorgeNachweisregisterKorrektur0805Type#getEintragungNachweisregisterAlt <em>Eintragung Nachweisregister Alt</em>}</li>
 *   <li>{@link de.xoev.xfamilie.geburt._1.geburt.SorgeNachweisregisterKorrektur0805Type#getAngabenZurMutterNeu <em>Angaben Zur Mutter Neu</em>}</li>
 *   <li>{@link de.xoev.xfamilie.geburt._1.geburt.SorgeNachweisregisterKorrektur0805Type#getAngabenZumKindNeu <em>Angaben Zum Kind Neu</em>}</li>
 *   <li>{@link de.xoev.xfamilie.geburt._1.geburt.SorgeNachweisregisterKorrektur0805Type#getEintragungNachweisregisterNeu <em>Eintragung Nachweisregister Neu</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.geburt._1.geburt.GeburtPackage#getSorgeNachweisregisterKorrektur0805Type()
 * @model extendedMetaData="name='sorge.nachweisregister.korrektur.0805_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface SorgeNachweisregisterKorrektur0805Type extends AntragsnachrichtType {
	/**
	 * Returns the value of the '<em><b>Angaben Zur Mutter Alt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Mutter des Kindes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Angaben Zur Mutter Alt</em>' containment reference.
	 * @see #setAngabenZurMutterAlt(AngabenZumElternteil2Type)
	 * @see de.xoev.xfamilie.geburt._1.geburt.GeburtPackage#getSorgeNachweisregisterKorrektur0805Type_AngabenZurMutterAlt()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='angabenZurMutterAlt' namespace='##targetNamespace'"
	 * @generated
	 */
	AngabenZumElternteil2Type getAngabenZurMutterAlt();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.geburt._1.geburt.SorgeNachweisregisterKorrektur0805Type#getAngabenZurMutterAlt <em>Angaben Zur Mutter Alt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Angaben Zur Mutter Alt</em>' containment reference.
	 * @see #getAngabenZurMutterAlt()
	 * @generated
	 */
	void setAngabenZurMutterAlt(AngabenZumElternteil2Type value);

	/**
	 * Returns the value of the '<em><b>Angaben Zum Kind Alt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Kind, zu dem Eintragungen im Nachweisregister vorgenommen werden.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Angaben Zum Kind Alt</em>' containment reference.
	 * @see #setAngabenZumKindAlt(AngabenZumKindType)
	 * @see de.xoev.xfamilie.geburt._1.geburt.GeburtPackage#getSorgeNachweisregisterKorrektur0805Type_AngabenZumKindAlt()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='angabenZumKindAlt' namespace='##targetNamespace'"
	 * @generated
	 */
	AngabenZumKindType getAngabenZumKindAlt();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.geburt._1.geburt.SorgeNachweisregisterKorrektur0805Type#getAngabenZumKindAlt <em>Angaben Zum Kind Alt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Angaben Zum Kind Alt</em>' containment reference.
	 * @see #getAngabenZumKindAlt()
	 * @generated
	 */
	void setAngabenZumKindAlt(AngabenZumKindType value);

	/**
	 * Returns the value of the '<em><b>Eintragung Nachweisregister Alt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angaben zur Eintragung im Sorgeregister.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Eintragung Nachweisregister Alt</em>' containment reference.
	 * @see #setEintragungNachweisregisterAlt(EintragungNachweisregisterType)
	 * @see de.xoev.xfamilie.geburt._1.geburt.GeburtPackage#getSorgeNachweisregisterKorrektur0805Type_EintragungNachweisregisterAlt()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='eintragungNachweisregisterAlt' namespace='##targetNamespace'"
	 * @generated
	 */
	EintragungNachweisregisterType getEintragungNachweisregisterAlt();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.geburt._1.geburt.SorgeNachweisregisterKorrektur0805Type#getEintragungNachweisregisterAlt <em>Eintragung Nachweisregister Alt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Eintragung Nachweisregister Alt</em>' containment reference.
	 * @see #getEintragungNachweisregisterAlt()
	 * @generated
	 */
	void setEintragungNachweisregisterAlt(EintragungNachweisregisterType value);

	/**
	 * Returns the value of the '<em><b>Angaben Zur Mutter Neu</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Mutter des Kindes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Angaben Zur Mutter Neu</em>' containment reference.
	 * @see #setAngabenZurMutterNeu(AngabenZumElternteil2Type)
	 * @see de.xoev.xfamilie.geburt._1.geburt.GeburtPackage#getSorgeNachweisregisterKorrektur0805Type_AngabenZurMutterNeu()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='angabenZurMutterNeu' namespace='##targetNamespace'"
	 * @generated
	 */
	AngabenZumElternteil2Type getAngabenZurMutterNeu();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.geburt._1.geburt.SorgeNachweisregisterKorrektur0805Type#getAngabenZurMutterNeu <em>Angaben Zur Mutter Neu</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Angaben Zur Mutter Neu</em>' containment reference.
	 * @see #getAngabenZurMutterNeu()
	 * @generated
	 */
	void setAngabenZurMutterNeu(AngabenZumElternteil2Type value);

	/**
	 * Returns the value of the '<em><b>Angaben Zum Kind Neu</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Kind, zu dem Eintragungen im Nachweisregister vorgenommen werden.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Angaben Zum Kind Neu</em>' containment reference.
	 * @see #setAngabenZumKindNeu(AngabenZumKindType)
	 * @see de.xoev.xfamilie.geburt._1.geburt.GeburtPackage#getSorgeNachweisregisterKorrektur0805Type_AngabenZumKindNeu()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='angabenZumKindNeu' namespace='##targetNamespace'"
	 * @generated
	 */
	AngabenZumKindType getAngabenZumKindNeu();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.geburt._1.geburt.SorgeNachweisregisterKorrektur0805Type#getAngabenZumKindNeu <em>Angaben Zum Kind Neu</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Angaben Zum Kind Neu</em>' containment reference.
	 * @see #getAngabenZumKindNeu()
	 * @generated
	 */
	void setAngabenZumKindNeu(AngabenZumKindType value);

	/**
	 * Returns the value of the '<em><b>Eintragung Nachweisregister Neu</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angaben zur Eintragung im Sorgeregister.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Eintragung Nachweisregister Neu</em>' containment reference.
	 * @see #setEintragungNachweisregisterNeu(EintragungNachweisregisterType)
	 * @see de.xoev.xfamilie.geburt._1.geburt.GeburtPackage#getSorgeNachweisregisterKorrektur0805Type_EintragungNachweisregisterNeu()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='eintragungNachweisregisterNeu' namespace='##targetNamespace'"
	 * @generated
	 */
	EintragungNachweisregisterType getEintragungNachweisregisterNeu();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.geburt._1.geburt.SorgeNachweisregisterKorrektur0805Type#getEintragungNachweisregisterNeu <em>Eintragung Nachweisregister Neu</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Eintragung Nachweisregister Neu</em>' containment reference.
	 * @see #getEintragungNachweisregisterNeu()
	 * @generated
	 */
	void setEintragungNachweisregisterNeu(EintragungNachweisregisterType value);

} // SorgeNachweisregisterKorrektur0805Type
