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

import de.xoev.xfamilie.baukasten._1.baukasten.NachweisdokumentType;
import de.xoev.xfamilie.baukasten._1.baukasten.ZeitraumType;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Nichtselbststaendigkeit Ausklammerungstatbestaende Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Bei der Bestimmung der zwölf Kalendermonate sind Kalendermonate auszuklammern, in denen ein Ausklammerungstatbestand nach Satz 2 Paragraf 2b BEEG erfüllt ist. Die Aufzählung der Ausklammerungstatbestände ist abschließend.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.NichtselbststaendigkeitAusklammerungstatbestaendeType#isMutterschaftsgeldbezugVorGeburtAntragskind <em>Mutterschaftsgeldbezug Vor Geburt Antragskind</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.NichtselbststaendigkeitAusklammerungstatbestaendeType#getNachweisMutterschaftsgeldbezugAntragskind <em>Nachweis Mutterschaftsgeldbezug Antragskind</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.NichtselbststaendigkeitAusklammerungstatbestaendeType#isMutterschaftsgeldbezugVorGeburtaelteresKind <em>Mutterschaftsgeldbezug Vor Geburtaelteres Kind</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.NichtselbststaendigkeitAusklammerungstatbestaendeType#getNachweisMutterschaftsgeldbezugAelteresKind <em>Nachweis Mutterschaftsgeldbezug Aelteres Kind</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.NichtselbststaendigkeitAusklammerungstatbestaendeType#isElterngeldbezugAelteresKind <em>Elterngeldbezug Aelteres Kind</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.NichtselbststaendigkeitAusklammerungstatbestaendeType#getNachweisElterngeldbezugAelteresKind <em>Nachweis Elterngeldbezug Aelteres Kind</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.NichtselbststaendigkeitAusklammerungstatbestaendeType#isMoeglicheEinkommensverluste <em>Moegliche Einkommensverluste</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.NichtselbststaendigkeitAusklammerungstatbestaendeType#getNachweisMoeglicheEinkommensverluste <em>Nachweis Moegliche Einkommensverluste</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.NichtselbststaendigkeitAusklammerungstatbestaendeType#isEinkommensverlustWehrUndZivildienst <em>Einkommensverlust Wehr Und Zivildienst</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.NichtselbststaendigkeitAusklammerungstatbestaendeType#getNachweisEinkommensverlustWehrUndZivildienst <em>Nachweis Einkommensverlust Wehr Und Zivildienst</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.NichtselbststaendigkeitAusklammerungstatbestaendeType#isAntragAusklammerungsverzicht <em>Antrag Ausklammerungsverzicht</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.NichtselbststaendigkeitAusklammerungstatbestaendeType#getZeitraumAntragAusklammerungsverzicht <em>Zeitraum Antrag Ausklammerungsverzicht</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.NichtselbststaendigkeitAusklammerungstatbestaendeType#isElterngeldbezugFuerBesondersFruehGeborenesAelteresKind <em>Elterngeldbezug Fuer Besonders Frueh Geborenes Aelteres Kind</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.NichtselbststaendigkeitAusklammerungstatbestaendeType#getNachweisAelteresBesondersFruehGeborenesKind <em>Nachweis Aelteres Besonders Frueh Geborenes Kind</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.NichtselbststaendigkeitAusklammerungstatbestaendeType#isEinkommensverlustDurchSchwangerschaftsbedingteErkrankung <em>Einkommensverlust Durch Schwangerschaftsbedingte Erkrankung</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.NichtselbststaendigkeitAusklammerungstatbestaendeType#getEinkommensverlustDurchSchwangerschaftsbedingteErkrankungNachweis <em>Einkommensverlust Durch Schwangerschaftsbedingte Erkrankung Nachweis</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getNichtselbststaendigkeitAusklammerungstatbestaendeType()
 * @model extendedMetaData="name='NichtselbststaendigkeitAusklammerungstatbestaendeType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface NichtselbststaendigkeitAusklammerungstatbestaendeType extends EObject {
	/**
	 * Returns the value of the '<em><b>Mutterschaftsgeldbezug Vor Geburt Antragskind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Bei der Bestimmung der zwölf Kalendermonate sind Kalendermonate auszuklammern, in denen ein Ausklammerungstatbestand nach Satz 2 Paragraf 2b BEEG erfüllt ist. Die Aufzählung der Ausklammerungstatbestände ist abschließend.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mutterschaftsgeldbezug Vor Geburt Antragskind</em>' attribute.
	 * @see #isSetMutterschaftsgeldbezugVorGeburtAntragskind()
	 * @see #unsetMutterschaftsgeldbezugVorGeburtAntragskind()
	 * @see #setMutterschaftsgeldbezugVorGeburtAntragskind(boolean)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getNichtselbststaendigkeitAusklammerungstatbestaendeType_MutterschaftsgeldbezugVorGeburtAntragskind()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='element' name='mutterschaftsgeldbezugVorGeburtAntragskind' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isMutterschaftsgeldbezugVorGeburtAntragskind();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.NichtselbststaendigkeitAusklammerungstatbestaendeType#isMutterschaftsgeldbezugVorGeburtAntragskind <em>Mutterschaftsgeldbezug Vor Geburt Antragskind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mutterschaftsgeldbezug Vor Geburt Antragskind</em>' attribute.
	 * @see #isSetMutterschaftsgeldbezugVorGeburtAntragskind()
	 * @see #unsetMutterschaftsgeldbezugVorGeburtAntragskind()
	 * @see #isMutterschaftsgeldbezugVorGeburtAntragskind()
	 * @generated
	 */
	void setMutterschaftsgeldbezugVorGeburtAntragskind(boolean value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.NichtselbststaendigkeitAusklammerungstatbestaendeType#isMutterschaftsgeldbezugVorGeburtAntragskind <em>Mutterschaftsgeldbezug Vor Geburt Antragskind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMutterschaftsgeldbezugVorGeburtAntragskind()
	 * @see #isMutterschaftsgeldbezugVorGeburtAntragskind()
	 * @see #setMutterschaftsgeldbezugVorGeburtAntragskind(boolean)
	 * @generated
	 */
	void unsetMutterschaftsgeldbezugVorGeburtAntragskind();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.NichtselbststaendigkeitAusklammerungstatbestaendeType#isMutterschaftsgeldbezugVorGeburtAntragskind <em>Mutterschaftsgeldbezug Vor Geburt Antragskind</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Mutterschaftsgeldbezug Vor Geburt Antragskind</em>' attribute is set.
	 * @see #unsetMutterschaftsgeldbezugVorGeburtAntragskind()
	 * @see #isMutterschaftsgeldbezugVorGeburtAntragskind()
	 * @see #setMutterschaftsgeldbezugVorGeburtAntragskind(boolean)
	 * @generated
	 */
	boolean isSetMutterschaftsgeldbezugVorGeburtAntragskind();

	/**
	 * Returns the value of the '<em><b>Nachweis Mutterschaftsgeldbezug Antragskind</b></em>' containment reference list.
	 * The list contents are of type {@link de.xoev.xfamilie.baukasten._1.baukasten.NachweisdokumentType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Bei der Bestimmung der zwölf Kalendermonate sind Kalendermonate auszuklammern, in denen ein Ausklammerungstatbestand nach Satz 2 Paragraf 2b BEEG erfüllt ist. Die Aufzählung der Ausklammerungstatbestände ist abschließend. Von den Antragstellenden im Antragsservice bereitgestellte Nachweisdokumente (hochgeladene Fotos, Scans, etc.).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nachweis Mutterschaftsgeldbezug Antragskind</em>' containment reference list.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getNichtselbststaendigkeitAusklammerungstatbestaendeType_NachweisMutterschaftsgeldbezugAntragskind()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='nachweisMutterschaftsgeldbezugAntragskind' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<NachweisdokumentType> getNachweisMutterschaftsgeldbezugAntragskind();

	/**
	 * Returns the value of the '<em><b>Mutterschaftsgeldbezug Vor Geburtaelteres Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Bei der Bestimmung der zwölf Kalendermonate sind Kalendermonate auszuklammern, in denen ein Ausklammerungstatbestand nach Satz 2 Paragraf 2b BEEG erfüllt ist. Die Aufzählung der Ausklammerungstatbestände ist abschließend.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mutterschaftsgeldbezug Vor Geburtaelteres Kind</em>' attribute.
	 * @see #isSetMutterschaftsgeldbezugVorGeburtaelteresKind()
	 * @see #unsetMutterschaftsgeldbezugVorGeburtaelteresKind()
	 * @see #setMutterschaftsgeldbezugVorGeburtaelteresKind(boolean)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getNichtselbststaendigkeitAusklammerungstatbestaendeType_MutterschaftsgeldbezugVorGeburtaelteresKind()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='element' name='mutterschaftsgeldbezugVorGeburtaelteresKind' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isMutterschaftsgeldbezugVorGeburtaelteresKind();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.NichtselbststaendigkeitAusklammerungstatbestaendeType#isMutterschaftsgeldbezugVorGeburtaelteresKind <em>Mutterschaftsgeldbezug Vor Geburtaelteres Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mutterschaftsgeldbezug Vor Geburtaelteres Kind</em>' attribute.
	 * @see #isSetMutterschaftsgeldbezugVorGeburtaelteresKind()
	 * @see #unsetMutterschaftsgeldbezugVorGeburtaelteresKind()
	 * @see #isMutterschaftsgeldbezugVorGeburtaelteresKind()
	 * @generated
	 */
	void setMutterschaftsgeldbezugVorGeburtaelteresKind(boolean value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.NichtselbststaendigkeitAusklammerungstatbestaendeType#isMutterschaftsgeldbezugVorGeburtaelteresKind <em>Mutterschaftsgeldbezug Vor Geburtaelteres Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMutterschaftsgeldbezugVorGeburtaelteresKind()
	 * @see #isMutterschaftsgeldbezugVorGeburtaelteresKind()
	 * @see #setMutterschaftsgeldbezugVorGeburtaelteresKind(boolean)
	 * @generated
	 */
	void unsetMutterschaftsgeldbezugVorGeburtaelteresKind();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.NichtselbststaendigkeitAusklammerungstatbestaendeType#isMutterschaftsgeldbezugVorGeburtaelteresKind <em>Mutterschaftsgeldbezug Vor Geburtaelteres Kind</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Mutterschaftsgeldbezug Vor Geburtaelteres Kind</em>' attribute is set.
	 * @see #unsetMutterschaftsgeldbezugVorGeburtaelteresKind()
	 * @see #isMutterschaftsgeldbezugVorGeburtaelteresKind()
	 * @see #setMutterschaftsgeldbezugVorGeburtaelteresKind(boolean)
	 * @generated
	 */
	boolean isSetMutterschaftsgeldbezugVorGeburtaelteresKind();

	/**
	 * Returns the value of the '<em><b>Nachweis Mutterschaftsgeldbezug Aelteres Kind</b></em>' containment reference list.
	 * The list contents are of type {@link de.xoev.xfamilie.baukasten._1.baukasten.NachweisdokumentType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Bei der Bestimmung der zwölf Kalendermonate sind Kalendermonate auszuklammern, in denen ein Ausklammerungstatbestand nach Satz 2 Paragraf 2b BEEG erfüllt ist. Die Aufzählung der Ausklammerungstatbestände ist abschließend. Von den Antragstellenden im Antragsservice bereitgestellte Nachweisdokumente (hochgeladene Fotos, Scans, etc.).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nachweis Mutterschaftsgeldbezug Aelteres Kind</em>' containment reference list.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getNichtselbststaendigkeitAusklammerungstatbestaendeType_NachweisMutterschaftsgeldbezugAelteresKind()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='nachweisMutterschaftsgeldbezugAelteresKind' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<NachweisdokumentType> getNachweisMutterschaftsgeldbezugAelteresKind();

	/**
	 * Returns the value of the '<em><b>Elterngeldbezug Aelteres Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Bei der Bestimmung der zwölf Kalendermonate sind Kalendermonate auszuklammern, in denen ein Ausklammerungstatbestand nach Satz 2 Paragraf 2b BEEG erfüllt ist. Die Aufzählung der Ausklammerungstatbestände ist abschließend.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Elterngeldbezug Aelteres Kind</em>' attribute.
	 * @see #isSetElterngeldbezugAelteresKind()
	 * @see #unsetElterngeldbezugAelteresKind()
	 * @see #setElterngeldbezugAelteresKind(boolean)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getNichtselbststaendigkeitAusklammerungstatbestaendeType_ElterngeldbezugAelteresKind()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='element' name='elterngeldbezugAelteresKind' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isElterngeldbezugAelteresKind();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.NichtselbststaendigkeitAusklammerungstatbestaendeType#isElterngeldbezugAelteresKind <em>Elterngeldbezug Aelteres Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Elterngeldbezug Aelteres Kind</em>' attribute.
	 * @see #isSetElterngeldbezugAelteresKind()
	 * @see #unsetElterngeldbezugAelteresKind()
	 * @see #isElterngeldbezugAelteresKind()
	 * @generated
	 */
	void setElterngeldbezugAelteresKind(boolean value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.NichtselbststaendigkeitAusklammerungstatbestaendeType#isElterngeldbezugAelteresKind <em>Elterngeldbezug Aelteres Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetElterngeldbezugAelteresKind()
	 * @see #isElterngeldbezugAelteresKind()
	 * @see #setElterngeldbezugAelteresKind(boolean)
	 * @generated
	 */
	void unsetElterngeldbezugAelteresKind();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.NichtselbststaendigkeitAusklammerungstatbestaendeType#isElterngeldbezugAelteresKind <em>Elterngeldbezug Aelteres Kind</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Elterngeldbezug Aelteres Kind</em>' attribute is set.
	 * @see #unsetElterngeldbezugAelteresKind()
	 * @see #isElterngeldbezugAelteresKind()
	 * @see #setElterngeldbezugAelteresKind(boolean)
	 * @generated
	 */
	boolean isSetElterngeldbezugAelteresKind();

	/**
	 * Returns the value of the '<em><b>Nachweis Elterngeldbezug Aelteres Kind</b></em>' containment reference list.
	 * The list contents are of type {@link de.xoev.xfamilie.baukasten._1.baukasten.NachweisdokumentType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Bei der Bestimmung der zwölf Kalendermonate sind Kalendermonate auszuklammern, in denen ein Ausklammerungstatbestand nach Satz 2 Paragraf 2b BEEG erfüllt ist. Die Aufzählung der Ausklammerungstatbestände ist abschließend. Von den Antragstellenden im Antragsservice bereitgestellte Nachweisdokumente (hochgeladene Fotos, Scans, etc.).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nachweis Elterngeldbezug Aelteres Kind</em>' containment reference list.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getNichtselbststaendigkeitAusklammerungstatbestaendeType_NachweisElterngeldbezugAelteresKind()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='nachweisElterngeldbezugAelteresKind' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<NachweisdokumentType> getNachweisElterngeldbezugAelteresKind();

	/**
	 * Returns the value of the '<em><b>Moegliche Einkommensverluste</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Bei der Bestimmung der zwölf Kalendermonate sind Kalendermonate auszuklammern, in denen ein Ausklammerungstatbestand nach Satz 2 Paragraf 2b BEEG erfüllt ist. Die Aufzählung der Ausklammerungstatbestände ist abschließend.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Moegliche Einkommensverluste</em>' attribute.
	 * @see #isSetMoeglicheEinkommensverluste()
	 * @see #unsetMoeglicheEinkommensverluste()
	 * @see #setMoeglicheEinkommensverluste(boolean)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getNichtselbststaendigkeitAusklammerungstatbestaendeType_MoeglicheEinkommensverluste()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='element' name='moeglicheEinkommensverluste' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isMoeglicheEinkommensverluste();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.NichtselbststaendigkeitAusklammerungstatbestaendeType#isMoeglicheEinkommensverluste <em>Moegliche Einkommensverluste</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Moegliche Einkommensverluste</em>' attribute.
	 * @see #isSetMoeglicheEinkommensverluste()
	 * @see #unsetMoeglicheEinkommensverluste()
	 * @see #isMoeglicheEinkommensverluste()
	 * @generated
	 */
	void setMoeglicheEinkommensverluste(boolean value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.NichtselbststaendigkeitAusklammerungstatbestaendeType#isMoeglicheEinkommensverluste <em>Moegliche Einkommensverluste</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMoeglicheEinkommensverluste()
	 * @see #isMoeglicheEinkommensverluste()
	 * @see #setMoeglicheEinkommensverluste(boolean)
	 * @generated
	 */
	void unsetMoeglicheEinkommensverluste();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.NichtselbststaendigkeitAusklammerungstatbestaendeType#isMoeglicheEinkommensverluste <em>Moegliche Einkommensverluste</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Moegliche Einkommensverluste</em>' attribute is set.
	 * @see #unsetMoeglicheEinkommensverluste()
	 * @see #isMoeglicheEinkommensverluste()
	 * @see #setMoeglicheEinkommensverluste(boolean)
	 * @generated
	 */
	boolean isSetMoeglicheEinkommensverluste();

	/**
	 * Returns the value of the '<em><b>Nachweis Moegliche Einkommensverluste</b></em>' containment reference list.
	 * The list contents are of type {@link de.xoev.xfamilie.baukasten._1.baukasten.NachweisdokumentType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Bei der Bestimmung der zwölf Kalendermonate sind Kalendermonate auszuklammern, in denen ein Ausklammerungstatbestand nach Satz 2 Paragraf 2b BEEG erfüllt ist. Die Aufzählung der Ausklammerungstatbestände ist abschließend.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nachweis Moegliche Einkommensverluste</em>' containment reference list.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getNichtselbststaendigkeitAusklammerungstatbestaendeType_NachweisMoeglicheEinkommensverluste()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='nachweisMoeglicheEinkommensverluste' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<NachweisdokumentType> getNachweisMoeglicheEinkommensverluste();

	/**
	 * Returns the value of the '<em><b>Einkommensverlust Wehr Und Zivildienst</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Bei der Bestimmung der zwölf Kalendermonate sind Kalendermonate auszuklammern, in denen ein Ausklammerungstatbestand nach Satz 2 Paragraf 2b BEEG erfüllt ist. Die Aufzählung der Ausklammerungstatbestände ist abschließend.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Einkommensverlust Wehr Und Zivildienst</em>' attribute.
	 * @see #isSetEinkommensverlustWehrUndZivildienst()
	 * @see #unsetEinkommensverlustWehrUndZivildienst()
	 * @see #setEinkommensverlustWehrUndZivildienst(boolean)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getNichtselbststaendigkeitAusklammerungstatbestaendeType_EinkommensverlustWehrUndZivildienst()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='element' name='einkommensverlustWehrUndZivildienst' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isEinkommensverlustWehrUndZivildienst();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.NichtselbststaendigkeitAusklammerungstatbestaendeType#isEinkommensverlustWehrUndZivildienst <em>Einkommensverlust Wehr Und Zivildienst</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Einkommensverlust Wehr Und Zivildienst</em>' attribute.
	 * @see #isSetEinkommensverlustWehrUndZivildienst()
	 * @see #unsetEinkommensverlustWehrUndZivildienst()
	 * @see #isEinkommensverlustWehrUndZivildienst()
	 * @generated
	 */
	void setEinkommensverlustWehrUndZivildienst(boolean value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.NichtselbststaendigkeitAusklammerungstatbestaendeType#isEinkommensverlustWehrUndZivildienst <em>Einkommensverlust Wehr Und Zivildienst</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEinkommensverlustWehrUndZivildienst()
	 * @see #isEinkommensverlustWehrUndZivildienst()
	 * @see #setEinkommensverlustWehrUndZivildienst(boolean)
	 * @generated
	 */
	void unsetEinkommensverlustWehrUndZivildienst();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.NichtselbststaendigkeitAusklammerungstatbestaendeType#isEinkommensverlustWehrUndZivildienst <em>Einkommensverlust Wehr Und Zivildienst</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Einkommensverlust Wehr Und Zivildienst</em>' attribute is set.
	 * @see #unsetEinkommensverlustWehrUndZivildienst()
	 * @see #isEinkommensverlustWehrUndZivildienst()
	 * @see #setEinkommensverlustWehrUndZivildienst(boolean)
	 * @generated
	 */
	boolean isSetEinkommensverlustWehrUndZivildienst();

	/**
	 * Returns the value of the '<em><b>Nachweis Einkommensverlust Wehr Und Zivildienst</b></em>' containment reference list.
	 * The list contents are of type {@link de.xoev.xfamilie.baukasten._1.baukasten.NachweisdokumentType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Bei der Bestimmung der zwölf Kalendermonate sind Kalendermonate auszuklammern, in denen ein Ausklammerungstatbestand nach Satz 2 Paragraf 2b BEEG erfüllt ist. Die Aufzählung der Ausklammerungstatbestände ist abschließend.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nachweis Einkommensverlust Wehr Und Zivildienst</em>' containment reference list.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getNichtselbststaendigkeitAusklammerungstatbestaendeType_NachweisEinkommensverlustWehrUndZivildienst()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='nachweisEinkommensverlustWehrUndZivildienst' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<NachweisdokumentType> getNachweisEinkommensverlustWehrUndZivildienst();

	/**
	 * Returns the value of the '<em><b>Antrag Ausklammerungsverzicht</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Bei der Bestimmung der zwölf Kalendermonate sind Kalendermonate auszuklammern, in denen ein Ausklammerungstatbestand nach Satz 2 Paragraf 2b BEEG erfüllt ist. Die Aufzählung der Ausklammerungstatbestände ist abschließend.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Antrag Ausklammerungsverzicht</em>' attribute.
	 * @see #isSetAntragAusklammerungsverzicht()
	 * @see #unsetAntragAusklammerungsverzicht()
	 * @see #setAntragAusklammerungsverzicht(boolean)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getNichtselbststaendigkeitAusklammerungstatbestaendeType_AntragAusklammerungsverzicht()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='element' name='antragAusklammerungsverzicht' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isAntragAusklammerungsverzicht();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.NichtselbststaendigkeitAusklammerungstatbestaendeType#isAntragAusklammerungsverzicht <em>Antrag Ausklammerungsverzicht</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Antrag Ausklammerungsverzicht</em>' attribute.
	 * @see #isSetAntragAusklammerungsverzicht()
	 * @see #unsetAntragAusklammerungsverzicht()
	 * @see #isAntragAusklammerungsverzicht()
	 * @generated
	 */
	void setAntragAusklammerungsverzicht(boolean value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.NichtselbststaendigkeitAusklammerungstatbestaendeType#isAntragAusklammerungsverzicht <em>Antrag Ausklammerungsverzicht</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAntragAusklammerungsverzicht()
	 * @see #isAntragAusklammerungsverzicht()
	 * @see #setAntragAusklammerungsverzicht(boolean)
	 * @generated
	 */
	void unsetAntragAusklammerungsverzicht();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.NichtselbststaendigkeitAusklammerungstatbestaendeType#isAntragAusklammerungsverzicht <em>Antrag Ausklammerungsverzicht</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Antrag Ausklammerungsverzicht</em>' attribute is set.
	 * @see #unsetAntragAusklammerungsverzicht()
	 * @see #isAntragAusklammerungsverzicht()
	 * @see #setAntragAusklammerungsverzicht(boolean)
	 * @generated
	 */
	boolean isSetAntragAusklammerungsverzicht();

	/**
	 * Returns the value of the '<em><b>Zeitraum Antrag Ausklammerungsverzicht</b></em>' containment reference list.
	 * The list contents are of type {@link de.xoev.xfamilie.baukasten._1.baukasten.ZeitraumType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Bei der Bestimmung der zwölf Kalendermonate sind Kalendermonate auszuklammern, in denen ein Ausklammerungstatbestand nach Satz 2 Paragraf 2b BEEG erfüllt ist. Die Aufzählung der Ausklammerungstatbestände ist abschließend.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Zeitraum Antrag Ausklammerungsverzicht</em>' containment reference list.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getNichtselbststaendigkeitAusklammerungstatbestaendeType_ZeitraumAntragAusklammerungsverzicht()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='zeitraumAntragAusklammerungsverzicht' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ZeitraumType> getZeitraumAntragAusklammerungsverzicht();

	/**
	 * Returns the value of the '<em><b>Elterngeldbezug Fuer Besonders Frueh Geborenes Aelteres Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Bei der Bestimmung der zwölf Kalendermonate sind Kalendermonate auszuklammern, in denen ein Ausklammerungstatbestand nach Satz 2 Paragraf 2b BEEG erfüllt ist. Die Aufzählung der Ausklammerungstatbestände ist abschließend.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Elterngeldbezug Fuer Besonders Frueh Geborenes Aelteres Kind</em>' attribute.
	 * @see #isSetElterngeldbezugFuerBesondersFruehGeborenesAelteresKind()
	 * @see #unsetElterngeldbezugFuerBesondersFruehGeborenesAelteresKind()
	 * @see #setElterngeldbezugFuerBesondersFruehGeborenesAelteresKind(boolean)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getNichtselbststaendigkeitAusklammerungstatbestaendeType_ElterngeldbezugFuerBesondersFruehGeborenesAelteresKind()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='element' name='elterngeldbezugFuerBesondersFruehGeborenesAelteresKind' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isElterngeldbezugFuerBesondersFruehGeborenesAelteresKind();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.NichtselbststaendigkeitAusklammerungstatbestaendeType#isElterngeldbezugFuerBesondersFruehGeborenesAelteresKind <em>Elterngeldbezug Fuer Besonders Frueh Geborenes Aelteres Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Elterngeldbezug Fuer Besonders Frueh Geborenes Aelteres Kind</em>' attribute.
	 * @see #isSetElterngeldbezugFuerBesondersFruehGeborenesAelteresKind()
	 * @see #unsetElterngeldbezugFuerBesondersFruehGeborenesAelteresKind()
	 * @see #isElterngeldbezugFuerBesondersFruehGeborenesAelteresKind()
	 * @generated
	 */
	void setElterngeldbezugFuerBesondersFruehGeborenesAelteresKind(boolean value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.NichtselbststaendigkeitAusklammerungstatbestaendeType#isElterngeldbezugFuerBesondersFruehGeborenesAelteresKind <em>Elterngeldbezug Fuer Besonders Frueh Geborenes Aelteres Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetElterngeldbezugFuerBesondersFruehGeborenesAelteresKind()
	 * @see #isElterngeldbezugFuerBesondersFruehGeborenesAelteresKind()
	 * @see #setElterngeldbezugFuerBesondersFruehGeborenesAelteresKind(boolean)
	 * @generated
	 */
	void unsetElterngeldbezugFuerBesondersFruehGeborenesAelteresKind();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.NichtselbststaendigkeitAusklammerungstatbestaendeType#isElterngeldbezugFuerBesondersFruehGeborenesAelteresKind <em>Elterngeldbezug Fuer Besonders Frueh Geborenes Aelteres Kind</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Elterngeldbezug Fuer Besonders Frueh Geborenes Aelteres Kind</em>' attribute is set.
	 * @see #unsetElterngeldbezugFuerBesondersFruehGeborenesAelteresKind()
	 * @see #isElterngeldbezugFuerBesondersFruehGeborenesAelteresKind()
	 * @see #setElterngeldbezugFuerBesondersFruehGeborenesAelteresKind(boolean)
	 * @generated
	 */
	boolean isSetElterngeldbezugFuerBesondersFruehGeborenesAelteresKind();

	/**
	 * Returns the value of the '<em><b>Nachweis Aelteres Besonders Frueh Geborenes Kind</b></em>' containment reference list.
	 * The list contents are of type {@link de.xoev.xfamilie.baukasten._1.baukasten.NachweisdokumentType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Bei der Bestimmung der zwölf Kalendermonate sind Kalendermonate auszuklammern, in denen ein Ausklammerungstatbestand nach Satz 2 Paragraf 2b BEEG erfüllt ist. Die Aufzählung der Ausklammerungstatbestände ist abschließend.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nachweis Aelteres Besonders Frueh Geborenes Kind</em>' containment reference list.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getNichtselbststaendigkeitAusklammerungstatbestaendeType_NachweisAelteresBesondersFruehGeborenesKind()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='nachweisAelteresBesondersFruehGeborenesKind' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<NachweisdokumentType> getNachweisAelteresBesondersFruehGeborenesKind();

	/**
	 * Returns the value of the '<em><b>Einkommensverlust Durch Schwangerschaftsbedingte Erkrankung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Einkommensverlust Durch Schwangerschaftsbedingte Erkrankung</em>' attribute.
	 * @see #isSetEinkommensverlustDurchSchwangerschaftsbedingteErkrankung()
	 * @see #unsetEinkommensverlustDurchSchwangerschaftsbedingteErkrankung()
	 * @see #setEinkommensverlustDurchSchwangerschaftsbedingteErkrankung(boolean)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getNichtselbststaendigkeitAusklammerungstatbestaendeType_EinkommensverlustDurchSchwangerschaftsbedingteErkrankung()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='einkommensverlustDurchSchwangerschaftsbedingteErkrankung' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isEinkommensverlustDurchSchwangerschaftsbedingteErkrankung();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.NichtselbststaendigkeitAusklammerungstatbestaendeType#isEinkommensverlustDurchSchwangerschaftsbedingteErkrankung <em>Einkommensverlust Durch Schwangerschaftsbedingte Erkrankung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Einkommensverlust Durch Schwangerschaftsbedingte Erkrankung</em>' attribute.
	 * @see #isSetEinkommensverlustDurchSchwangerschaftsbedingteErkrankung()
	 * @see #unsetEinkommensverlustDurchSchwangerschaftsbedingteErkrankung()
	 * @see #isEinkommensverlustDurchSchwangerschaftsbedingteErkrankung()
	 * @generated
	 */
	void setEinkommensverlustDurchSchwangerschaftsbedingteErkrankung(boolean value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.NichtselbststaendigkeitAusklammerungstatbestaendeType#isEinkommensverlustDurchSchwangerschaftsbedingteErkrankung <em>Einkommensverlust Durch Schwangerschaftsbedingte Erkrankung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEinkommensverlustDurchSchwangerschaftsbedingteErkrankung()
	 * @see #isEinkommensverlustDurchSchwangerschaftsbedingteErkrankung()
	 * @see #setEinkommensverlustDurchSchwangerschaftsbedingteErkrankung(boolean)
	 * @generated
	 */
	void unsetEinkommensverlustDurchSchwangerschaftsbedingteErkrankung();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.NichtselbststaendigkeitAusklammerungstatbestaendeType#isEinkommensverlustDurchSchwangerschaftsbedingteErkrankung <em>Einkommensverlust Durch Schwangerschaftsbedingte Erkrankung</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Einkommensverlust Durch Schwangerschaftsbedingte Erkrankung</em>' attribute is set.
	 * @see #unsetEinkommensverlustDurchSchwangerschaftsbedingteErkrankung()
	 * @see #isEinkommensverlustDurchSchwangerschaftsbedingteErkrankung()
	 * @see #setEinkommensverlustDurchSchwangerschaftsbedingteErkrankung(boolean)
	 * @generated
	 */
	boolean isSetEinkommensverlustDurchSchwangerschaftsbedingteErkrankung();

	/**
	 * Returns the value of the '<em><b>Einkommensverlust Durch Schwangerschaftsbedingte Erkrankung Nachweis</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Boolean}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Einkommensverlust Durch Schwangerschaftsbedingte Erkrankung Nachweis</em>' attribute list.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getNichtselbststaendigkeitAusklammerungstatbestaendeType_EinkommensverlustDurchSchwangerschaftsbedingteErkrankungNachweis()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='einkommensverlustDurchSchwangerschaftsbedingteErkrankungNachweis' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Boolean> getEinkommensverlustDurchSchwangerschaftsbedingteErkrankungNachweis();

} // NichtselbststaendigkeitAusklammerungstatbestaendeType
