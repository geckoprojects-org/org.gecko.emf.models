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
 * A representation of the model object '<em><b>Sorge Alleinsorge Auskunft0803 Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.geburt._1.geburt.SorgeAlleinsorgeAuskunft0803Type#getAngabenZurMutter <em>Angaben Zur Mutter</em>}</li>
 *   <li>{@link de.xoev.xfamilie.geburt._1.geburt.SorgeAlleinsorgeAuskunft0803Type#getAngabenZumKind <em>Angaben Zum Kind</em>}</li>
 *   <li>{@link de.xoev.xfamilie.geburt._1.geburt.SorgeAlleinsorgeAuskunft0803Type#getZusatzangaben <em>Zusatzangaben</em>}</li>
 *   <li>{@link de.xoev.xfamilie.geburt._1.geburt.SorgeAlleinsorgeAuskunft0803Type#getEintragungNachweisregister <em>Eintragung Nachweisregister</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.geburt._1.geburt.GeburtPackage#getSorgeAlleinsorgeAuskunft0803Type()
 * @model extendedMetaData="name='sorge.alleinsorge.auskunft.0803_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface SorgeAlleinsorgeAuskunft0803Type extends AntragsnachrichtType {
	/**
	 * Returns the value of the '<em><b>Angaben Zur Mutter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Mutter des Kindes, die eine Auskunft über die Alleinsorge beantragt hat.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Angaben Zur Mutter</em>' containment reference.
	 * @see #setAngabenZurMutter(AngabenZumElternteil2Type)
	 * @see de.xoev.xfamilie.geburt._1.geburt.GeburtPackage#getSorgeAlleinsorgeAuskunft0803Type_AngabenZurMutter()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='angabenZurMutter' namespace='##targetNamespace'"
	 * @generated
	 */
	AngabenZumElternteil2Type getAngabenZurMutter();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.geburt._1.geburt.SorgeAlleinsorgeAuskunft0803Type#getAngabenZurMutter <em>Angaben Zur Mutter</em>}' containment reference.
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
	 * Kind für das die Auskunft über die Alleinsorge ausgestellt werden soll.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Angaben Zum Kind</em>' containment reference.
	 * @see #setAngabenZumKind(AngabenZumKindType)
	 * @see de.xoev.xfamilie.geburt._1.geburt.GeburtPackage#getSorgeAlleinsorgeAuskunft0803Type_AngabenZumKind()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='angabenZumKind' namespace='##targetNamespace'"
	 * @generated
	 */
	AngabenZumKindType getAngabenZumKind();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.geburt._1.geburt.SorgeAlleinsorgeAuskunft0803Type#getAngabenZumKind <em>Angaben Zum Kind</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Angaben Zum Kind</em>' containment reference.
	 * @see #getAngabenZumKind()
	 * @generated
	 */
	void setAngabenZumKind(AngabenZumKindType value);

	/**
	 * Returns the value of the '<em><b>Zusatzangaben</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angaben der beantragenden Mutter bei der Antragstellung.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Zusatzangaben</em>' containment reference.
	 * @see #setZusatzangaben(ZusatzangabenType)
	 * @see de.xoev.xfamilie.geburt._1.geburt.GeburtPackage#getSorgeAlleinsorgeAuskunft0803Type_Zusatzangaben()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='zusatzangaben' namespace='##targetNamespace'"
	 * @generated
	 */
	ZusatzangabenType getZusatzangaben();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.geburt._1.geburt.SorgeAlleinsorgeAuskunft0803Type#getZusatzangaben <em>Zusatzangaben</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zusatzangaben</em>' containment reference.
	 * @see #getZusatzangaben()
	 * @generated
	 */
	void setZusatzangaben(ZusatzangabenType value);

	/**
	 * Returns the value of the '<em><b>Eintragung Nachweisregister</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angaben zur Eintragung im Nachweisregister.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Eintragung Nachweisregister</em>' containment reference.
	 * @see #setEintragungNachweisregister(EintragungNachweisregisterType)
	 * @see de.xoev.xfamilie.geburt._1.geburt.GeburtPackage#getSorgeAlleinsorgeAuskunft0803Type_EintragungNachweisregister()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='eintragungNachweisregister' namespace='##targetNamespace'"
	 * @generated
	 */
	EintragungNachweisregisterType getEintragungNachweisregister();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.geburt._1.geburt.SorgeAlleinsorgeAuskunft0803Type#getEintragungNachweisregister <em>Eintragung Nachweisregister</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Eintragung Nachweisregister</em>' containment reference.
	 * @see #getEintragungNachweisregister()
	 * @generated
	 */
	void setEintragungNachweisregister(EintragungNachweisregisterType value);

} // SorgeAlleinsorgeAuskunft0803Type
