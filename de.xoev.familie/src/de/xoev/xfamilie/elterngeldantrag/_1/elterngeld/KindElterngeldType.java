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
package de.xoev.xfamilie.elterngeldantrag._1.elterngeld;

import de.xoev.xfamilie.baukasten._1.baukasten.CodeStandesamtnummernType;
import de.xoev.xfamilie.baukasten._1.baukasten.GeburtGeburtsortOptionalType;
import de.xoev.xfamilie.baukasten._1.baukasten.NachweisdokumentType;
import de.xoev.xfamilie.baukasten._1.baukasten.NameNatuerlichePersonType;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Kind Elterngeld Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Daten zum Kind des antragstellenden Elternteils.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.KindElterngeldType#getNameKind <em>Name Kind</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.KindElterngeldType#getGeburtsdatum <em>Geburtsdatum</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.KindElterngeldType#getGeburtsurkunde <em>Geburtsurkunde</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.KindElterngeldType#getAnschriftBeiAntragstellung <em>Anschrift Bei Antragstellung</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.KindElterngeldType#getBesondersFruehGeborenesKind <em>Besonders Frueh Geborenes Kind</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.KindElterngeldType#getAdoption <em>Adoption</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.KindElterngeldType#getMehrlingsgeburt <em>Mehrlingsgeburt</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.KindElterngeldType#getBehinderungKind <em>Behinderung Kind</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.KindElterngeldType#getNummerGeburtsstandesamt <em>Nummer Geburtsstandesamt</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getKindElterngeldType()
 * @model extendedMetaData="name='Kind.ElterngeldType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface KindElterngeldType extends EObject {
	/**
	 * Returns the value of the '<em><b>Name Kind</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Name des Kindes
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name Kind</em>' containment reference.
	 * @see #setNameKind(NameNatuerlichePersonType)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getKindElterngeldType_NameKind()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='nameKind' namespace='##targetNamespace'"
	 * @generated
	 */
	NameNatuerlichePersonType getNameKind();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.KindElterngeldType#getNameKind <em>Name Kind</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Kind</em>' containment reference.
	 * @see #getNameKind()
	 * @generated
	 */
	void setNameKind(NameNatuerlichePersonType value);

	/**
	 * Returns the value of the '<em><b>Geburtsdatum</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angaben zur Geburt des Kindes. Das Geburtsdatum muss vollständig sein, also auch Tag und Monat beinhalten.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Geburtsdatum</em>' containment reference.
	 * @see #setGeburtsdatum(GeburtGeburtsortOptionalType)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getKindElterngeldType_Geburtsdatum()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='geburtsdatum' namespace='##targetNamespace'"
	 * @generated
	 */
	GeburtGeburtsortOptionalType getGeburtsdatum();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.KindElterngeldType#getGeburtsdatum <em>Geburtsdatum</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Geburtsdatum</em>' containment reference.
	 * @see #getGeburtsdatum()
	 * @generated
	 */
	void setGeburtsdatum(GeburtGeburtsortOptionalType value);

	/**
	 * Returns the value of the '<em><b>Geburtsurkunde</b></em>' containment reference list.
	 * The list contents are of type {@link de.xoev.xfamilie.baukasten._1.baukasten.NachweisdokumentType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Von den Antragstellenden im Antragsservice bereitgestellte Nachweisdokumente (hochgeladene Fotos, Scans, etc.). Siehe auch .
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Geburtsurkunde</em>' containment reference list.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getKindElterngeldType_Geburtsurkunde()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='geburtsurkunde' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<NachweisdokumentType> getGeburtsurkunde();

	/**
	 * Returns the value of the '<em><b>Anschrift Bei Antragstellung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Optionale Angaben zur Anschrift des Kindes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Anschrift Bei Antragstellung</em>' containment reference.
	 * @see #setAnschriftBeiAntragstellung(AnschriftKindOptionalType)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getKindElterngeldType_AnschriftBeiAntragstellung()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='anschriftBeiAntragstellung' namespace='##targetNamespace'"
	 * @generated
	 */
	AnschriftKindOptionalType getAnschriftBeiAntragstellung();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.KindElterngeldType#getAnschriftBeiAntragstellung <em>Anschrift Bei Antragstellung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Anschrift Bei Antragstellung</em>' containment reference.
	 * @see #getAnschriftBeiAntragstellung()
	 * @generated
	 */
	void setAnschriftBeiAntragstellung(AnschriftKindOptionalType value);

	/**
	 * Returns the value of the '<em><b>Besonders Frueh Geborenes Kind</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angaben, ob es sich um ein besonders früh geborenes Kind handelt.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Besonders Frueh Geborenes Kind</em>' containment reference.
	 * @see #setBesondersFruehGeborenesKind(BesondersFruehGeborenesKindType)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getKindElterngeldType_BesondersFruehGeborenesKind()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='besondersFruehGeborenesKind' namespace='##targetNamespace'"
	 * @generated
	 */
	BesondersFruehGeborenesKindType getBesondersFruehGeborenesKind();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.KindElterngeldType#getBesondersFruehGeborenesKind <em>Besonders Frueh Geborenes Kind</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Besonders Frueh Geborenes Kind</em>' containment reference.
	 * @see #getBesondersFruehGeborenesKind()
	 * @generated
	 */
	void setBesondersFruehGeborenesKind(BesondersFruehGeborenesKindType value);

	/**
	 * Returns the value of the '<em><b>Adoption</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angaben zur Adoption des Kindes
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Adoption</em>' containment reference.
	 * @see #setAdoption(AdoptionType)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getKindElterngeldType_Adoption()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='adoption' namespace='##targetNamespace'"
	 * @generated
	 */
	AdoptionType getAdoption();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.KindElterngeldType#getAdoption <em>Adoption</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Adoption</em>' containment reference.
	 * @see #getAdoption()
	 * @generated
	 */
	void setAdoption(AdoptionType value);

	/**
	 * Returns the value of the '<em><b>Mehrlingsgeburt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angaben zu einer Mehrlingsgeburt.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mehrlingsgeburt</em>' containment reference.
	 * @see #setMehrlingsgeburt(MehrlingsgeburtType)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getKindElterngeldType_Mehrlingsgeburt()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='mehrlingsgeburt' namespace='##targetNamespace'"
	 * @generated
	 */
	MehrlingsgeburtType getMehrlingsgeburt();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.KindElterngeldType#getMehrlingsgeburt <em>Mehrlingsgeburt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mehrlingsgeburt</em>' containment reference.
	 * @see #getMehrlingsgeburt()
	 * @generated
	 */
	void setMehrlingsgeburt(MehrlingsgeburtType value);

	/**
	 * Returns the value of the '<em><b>Behinderung Kind</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angabe über Behindertenstatus des Kindes, relevant für Anzahl gemeinsamer Partnermonate
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Behinderung Kind</em>' containment reference.
	 * @see #setBehinderungKind(BehinderungKindType)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getKindElterngeldType_BehinderungKind()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='behinderungKind' namespace='##targetNamespace'"
	 * @generated
	 */
	BehinderungKindType getBehinderungKind();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.KindElterngeldType#getBehinderungKind <em>Behinderung Kind</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Behinderung Kind</em>' containment reference.
	 * @see #getBehinderungKind()
	 * @generated
	 */
	void setBehinderungKind(BehinderungKindType value);

	/**
	 * Returns the value of the '<em><b>Nummer Geburtsstandesamt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Name des Kindes
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nummer Geburtsstandesamt</em>' containment reference.
	 * @see #setNummerGeburtsstandesamt(CodeStandesamtnummernType)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getKindElterngeldType_NummerGeburtsstandesamt()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='nummerGeburtsstandesamt' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeStandesamtnummernType getNummerGeburtsstandesamt();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.KindElterngeldType#getNummerGeburtsstandesamt <em>Nummer Geburtsstandesamt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nummer Geburtsstandesamt</em>' containment reference.
	 * @see #getNummerGeburtsstandesamt()
	 * @generated
	 */
	void setNummerGeburtsstandesamt(CodeStandesamtnummernType value);

} // KindElterngeldType
