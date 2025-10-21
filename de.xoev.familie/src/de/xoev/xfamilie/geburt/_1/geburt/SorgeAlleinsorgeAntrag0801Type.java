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
import de.xoev.xfamilie.baukasten._1.baukasten.TerminwunschType;

import org.eclipse.emf.common.util.EList;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sorge Alleinsorge Antrag0801 Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.geburt._1.geburt.SorgeAlleinsorgeAntrag0801Type#getAngabenZurMutter <em>Angaben Zur Mutter</em>}</li>
 *   <li>{@link de.xoev.xfamilie.geburt._1.geburt.SorgeAlleinsorgeAntrag0801Type#getAngabenZumKind <em>Angaben Zum Kind</em>}</li>
 *   <li>{@link de.xoev.xfamilie.geburt._1.geburt.SorgeAlleinsorgeAntrag0801Type#getZusatzangaben <em>Zusatzangaben</em>}</li>
 *   <li>{@link de.xoev.xfamilie.geburt._1.geburt.SorgeAlleinsorgeAntrag0801Type#getTerminwuensche <em>Terminwuensche</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.geburt._1.geburt.GeburtPackage#getSorgeAlleinsorgeAntrag0801Type()
 * @model extendedMetaData="name='sorge.alleinsorge.antrag.0801_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface SorgeAlleinsorgeAntrag0801Type extends AntragsnachrichtType {
	/**
	 * Returns the value of the '<em><b>Angaben Zur Mutter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angaben zur Mutter des Kindes, die den Antrag auf Auskunft einer Alleinsorge stellt.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Angaben Zur Mutter</em>' containment reference.
	 * @see #setAngabenZurMutter(AngabenZumElternteil2Type)
	 * @see de.xoev.xfamilie.geburt._1.geburt.GeburtPackage#getSorgeAlleinsorgeAntrag0801Type_AngabenZurMutter()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='angabenZurMutter' namespace='##targetNamespace'"
	 * @generated
	 */
	AngabenZumElternteil2Type getAngabenZurMutter();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.geburt._1.geburt.SorgeAlleinsorgeAntrag0801Type#getAngabenZurMutter <em>Angaben Zur Mutter</em>}' containment reference.
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
	 * Angaben zum Kind, für das die Mutter die Auskunft einer Alleinsorge beantragt.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Angaben Zum Kind</em>' containment reference.
	 * @see #setAngabenZumKind(AngabenZumKindType)
	 * @see de.xoev.xfamilie.geburt._1.geburt.GeburtPackage#getSorgeAlleinsorgeAntrag0801Type_AngabenZumKind()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='angabenZumKind' namespace='##targetNamespace'"
	 * @generated
	 */
	AngabenZumKindType getAngabenZumKind();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.geburt._1.geburt.SorgeAlleinsorgeAntrag0801Type#getAngabenZumKind <em>Angaben Zum Kind</em>}' containment reference.
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
	 * Angaben zur Prüfung der berechtigten Antragstellung.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Zusatzangaben</em>' containment reference.
	 * @see #setZusatzangaben(ZusatzangabenType)
	 * @see de.xoev.xfamilie.geburt._1.geburt.GeburtPackage#getSorgeAlleinsorgeAntrag0801Type_Zusatzangaben()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='zusatzangaben' namespace='##targetNamespace'"
	 * @generated
	 */
	ZusatzangabenType getZusatzangaben();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.geburt._1.geburt.SorgeAlleinsorgeAntrag0801Type#getZusatzangaben <em>Zusatzangaben</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zusatzangaben</em>' containment reference.
	 * @see #getZusatzangaben()
	 * @generated
	 */
	void setZusatzangaben(ZusatzangabenType value);

	/**
	 * Returns the value of the '<em><b>Terminwuensche</b></em>' containment reference list.
	 * The list contents are of type {@link de.xoev.xfamilie.baukasten._1.baukasten.TerminwunschType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ist der Antrag an ein Jugendamt gerichtet und wird durch die Antragstellerin ein persönlicher Termin gewünscht, so können hier Terminwünsche übermittelt werden.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Terminwuensche</em>' containment reference list.
	 * @see de.xoev.xfamilie.geburt._1.geburt.GeburtPackage#getSorgeAlleinsorgeAntrag0801Type_Terminwuensche()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='terminwuensche' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TerminwunschType> getTerminwuensche();

} // SorgeAlleinsorgeAntrag0801Type
