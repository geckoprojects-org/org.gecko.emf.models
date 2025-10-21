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

import de.xoev.xfamilie.baukasten._1.baukasten.CodeGeschlechtType;
import de.xoev.xfamilie.baukasten._1.baukasten.FamilienstandNachweisbezugType;
import de.xoev.xfamilie.baukasten._1.baukasten.NachweisdokumentType;
import de.xoev.xfamilie.baukasten._1.baukasten.NameNatuerlichePersonNachweisbezugType;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Persoenliche Angaben ET Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.PersoenlicheAngabenETType#getName <em>Name</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.PersoenlicheAngabenETType#getGeburtsdatum <em>Geburtsdatum</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.PersoenlicheAngabenETType#getGeburtsort <em>Geburtsort</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.PersoenlicheAngabenETType#getGeschlecht <em>Geschlecht</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.PersoenlicheAngabenETType#getFamilienstand <em>Familienstand</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.PersoenlicheAngabenETType#isVerheiratetVerpartnertMitET <em>Verheiratet Verpartnert Mit ET</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.PersoenlicheAngabenETType#isUnverheiratetesZusammenleben <em>Unverheiratetes Zusammenleben</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.PersoenlicheAngabenETType#isAlleinerziehend <em>Alleinerziehend</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.PersoenlicheAngabenETType#getStaatsangehoerigkeit <em>Staatsangehoerigkeit</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.PersoenlicheAngabenETType#getNachweisPersonalausweisPass <em>Nachweis Personalausweis Pass</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.PersoenlicheAngabenETType#getMeldedatenabgleich <em>Meldedatenabgleich</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getPersoenlicheAngabenETType()
 * @model extendedMetaData="name='PersoenlicheAngabenETType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface PersoenlicheAngabenETType extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Der Name des antragstellenden Elternteils
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(NameNatuerlichePersonNachweisbezugType)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getPersoenlicheAngabenETType_Name()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	NameNatuerlichePersonNachweisbezugType getName();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.PersoenlicheAngabenETType#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(NameNatuerlichePersonNachweisbezugType value);

	/**
	 * Returns the value of the '<em><b>Geburtsdatum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Geburtsdatum</em>' attribute.
	 * @see #setGeburtsdatum(XMLGregorianCalendar)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getPersoenlicheAngabenETType_Geburtsdatum()
	 * @model dataType="de.xoev.xfamilie.baukasten._1.baukasten.TagesdatumType" required="true"
	 *        extendedMetaData="kind='element' name='geburtsdatum' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getGeburtsdatum();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.PersoenlicheAngabenETType#getGeburtsdatum <em>Geburtsdatum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Geburtsdatum</em>' attribute.
	 * @see #getGeburtsdatum()
	 * @generated
	 */
	void setGeburtsdatum(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Geburtsort</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Der Geburtsort der betroffenen Person kann optional an dieser Stelle als Freitext übermittelt werden.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Geburtsort</em>' attribute.
	 * @see #setGeburtsort(String)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getPersoenlicheAngabenETType_Geburtsort()
	 * @model dataType="de.xoev.kosit.datentyp._202204.din91379.DatatypeC"
	 *        extendedMetaData="kind='element' name='geburtsort' namespace='##targetNamespace'"
	 * @generated
	 */
	String getGeburtsort();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.PersoenlicheAngabenETType#getGeburtsort <em>Geburtsort</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Geburtsort</em>' attribute.
	 * @see #getGeburtsort()
	 * @generated
	 */
	void setGeburtsort(String value);

	/**
	 * Returns the value of the '<em><b>Geschlecht</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Das Geschlecht des antragstellenden Elternteils
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Geschlecht</em>' containment reference.
	 * @see #setGeschlecht(CodeGeschlechtType)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getPersoenlicheAngabenETType_Geschlecht()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='geschlecht' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeGeschlechtType getGeschlecht();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.PersoenlicheAngabenETType#getGeschlecht <em>Geschlecht</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Geschlecht</em>' containment reference.
	 * @see #getGeschlecht()
	 * @generated
	 */
	void setGeschlecht(CodeGeschlechtType value);

	/**
	 * Returns the value of the '<em><b>Familienstand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Der Familienstand des antragstellenden Elternteils. Für die Elterngeldnachricht sind nur die folgenden fünf Codewerte zu nutzen: LD, VH, LP, GS, VW.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Familienstand</em>' containment reference.
	 * @see #setFamilienstand(FamilienstandNachweisbezugType)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getPersoenlicheAngabenETType_Familienstand()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='familienstand' namespace='##targetNamespace'"
	 * @generated
	 */
	FamilienstandNachweisbezugType getFamilienstand();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.PersoenlicheAngabenETType#getFamilienstand <em>Familienstand</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Familienstand</em>' containment reference.
	 * @see #getFamilienstand()
	 * @generated
	 */
	void setFamilienstand(FamilienstandNachweisbezugType value);

	/**
	 * Returns the value of the '<em><b>Verheiratet Verpartnert Mit ET</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Diese Boolean-Angabe ist verpflichtend auszufüllen, wenn in der Codeliste Familienstand die Werte VH oder LP ausgewählt wurden.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Verheiratet Verpartnert Mit ET</em>' attribute.
	 * @see #isSetVerheiratetVerpartnertMitET()
	 * @see #unsetVerheiratetVerpartnertMitET()
	 * @see #setVerheiratetVerpartnertMitET(boolean)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getPersoenlicheAngabenETType_VerheiratetVerpartnertMitET()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='verheiratetVerpartnertMitET' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isVerheiratetVerpartnertMitET();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.PersoenlicheAngabenETType#isVerheiratetVerpartnertMitET <em>Verheiratet Verpartnert Mit ET</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Verheiratet Verpartnert Mit ET</em>' attribute.
	 * @see #isSetVerheiratetVerpartnertMitET()
	 * @see #unsetVerheiratetVerpartnertMitET()
	 * @see #isVerheiratetVerpartnertMitET()
	 * @generated
	 */
	void setVerheiratetVerpartnertMitET(boolean value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.PersoenlicheAngabenETType#isVerheiratetVerpartnertMitET <em>Verheiratet Verpartnert Mit ET</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVerheiratetVerpartnertMitET()
	 * @see #isVerheiratetVerpartnertMitET()
	 * @see #setVerheiratetVerpartnertMitET(boolean)
	 * @generated
	 */
	void unsetVerheiratetVerpartnertMitET();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.PersoenlicheAngabenETType#isVerheiratetVerpartnertMitET <em>Verheiratet Verpartnert Mit ET</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Verheiratet Verpartnert Mit ET</em>' attribute is set.
	 * @see #unsetVerheiratetVerpartnertMitET()
	 * @see #isVerheiratetVerpartnertMitET()
	 * @see #setVerheiratetVerpartnertMitET(boolean)
	 * @generated
	 */
	boolean isSetVerheiratetVerpartnertMitET();

	/**
	 * Returns the value of the '<em><b>Unverheiratetes Zusammenleben</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unverheiratetes Zusammenleben</em>' attribute.
	 * @see #isSetUnverheiratetesZusammenleben()
	 * @see #unsetUnverheiratetesZusammenleben()
	 * @see #setUnverheiratetesZusammenleben(boolean)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getPersoenlicheAngabenETType_UnverheiratetesZusammenleben()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='element' name='unverheiratetesZusammenleben' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isUnverheiratetesZusammenleben();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.PersoenlicheAngabenETType#isUnverheiratetesZusammenleben <em>Unverheiratetes Zusammenleben</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unverheiratetes Zusammenleben</em>' attribute.
	 * @see #isSetUnverheiratetesZusammenleben()
	 * @see #unsetUnverheiratetesZusammenleben()
	 * @see #isUnverheiratetesZusammenleben()
	 * @generated
	 */
	void setUnverheiratetesZusammenleben(boolean value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.PersoenlicheAngabenETType#isUnverheiratetesZusammenleben <em>Unverheiratetes Zusammenleben</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUnverheiratetesZusammenleben()
	 * @see #isUnverheiratetesZusammenleben()
	 * @see #setUnverheiratetesZusammenleben(boolean)
	 * @generated
	 */
	void unsetUnverheiratetesZusammenleben();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.PersoenlicheAngabenETType#isUnverheiratetesZusammenleben <em>Unverheiratetes Zusammenleben</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Unverheiratetes Zusammenleben</em>' attribute is set.
	 * @see #unsetUnverheiratetesZusammenleben()
	 * @see #isUnverheiratetesZusammenleben()
	 * @see #setUnverheiratetesZusammenleben(boolean)
	 * @generated
	 */
	boolean isSetUnverheiratetesZusammenleben();

	/**
	 * Returns the value of the '<em><b>Alleinerziehend</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alleinerziehend</em>' attribute.
	 * @see #isSetAlleinerziehend()
	 * @see #unsetAlleinerziehend()
	 * @see #setAlleinerziehend(boolean)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getPersoenlicheAngabenETType_Alleinerziehend()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='element' name='alleinerziehend' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isAlleinerziehend();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.PersoenlicheAngabenETType#isAlleinerziehend <em>Alleinerziehend</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alleinerziehend</em>' attribute.
	 * @see #isSetAlleinerziehend()
	 * @see #unsetAlleinerziehend()
	 * @see #isAlleinerziehend()
	 * @generated
	 */
	void setAlleinerziehend(boolean value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.PersoenlicheAngabenETType#isAlleinerziehend <em>Alleinerziehend</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAlleinerziehend()
	 * @see #isAlleinerziehend()
	 * @see #setAlleinerziehend(boolean)
	 * @generated
	 */
	void unsetAlleinerziehend();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.PersoenlicheAngabenETType#isAlleinerziehend <em>Alleinerziehend</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Alleinerziehend</em>' attribute is set.
	 * @see #unsetAlleinerziehend()
	 * @see #isAlleinerziehend()
	 * @see #setAlleinerziehend(boolean)
	 * @generated
	 */
	boolean isSetAlleinerziehend();

	/**
	 * Returns the value of the '<em><b>Staatsangehoerigkeit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Staatsangehörigkeiten des antragstellenden Elternteils.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Staatsangehoerigkeit</em>' containment reference.
	 * @see #setStaatsangehoerigkeit(StaatsangehoerigkeitType)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getPersoenlicheAngabenETType_Staatsangehoerigkeit()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='staatsangehoerigkeit' namespace='##targetNamespace'"
	 * @generated
	 */
	StaatsangehoerigkeitType getStaatsangehoerigkeit();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.PersoenlicheAngabenETType#getStaatsangehoerigkeit <em>Staatsangehoerigkeit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Staatsangehoerigkeit</em>' containment reference.
	 * @see #getStaatsangehoerigkeit()
	 * @generated
	 */
	void setStaatsangehoerigkeit(StaatsangehoerigkeitType value);

	/**
	 * Returns the value of the '<em><b>Nachweis Personalausweis Pass</b></em>' containment reference list.
	 * The list contents are of type {@link de.xoev.xfamilie.baukasten._1.baukasten.NachweisdokumentType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Von den Antragstellenden im Antragsservice bereitgestellte Nachweisdokumente (hochgeladene Fotos, Scans, etc.). Siehe auch .
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nachweis Personalausweis Pass</em>' containment reference list.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getPersoenlicheAngabenETType_NachweisPersonalausweisPass()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='nachweisPersonalausweisPass' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<NachweisdokumentType> getNachweisPersonalausweisPass();

	/**
	 * Returns the value of the '<em><b>Meldedatenabgleich</b></em>' containment reference list.
	 * The list contents are of type {@link de.xoev.xfamilie.baukasten._1.baukasten.NachweisdokumentType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Meldedatenabgleich</em>' containment reference list.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getPersoenlicheAngabenETType_Meldedatenabgleich()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='meldedatenabgleich' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<NachweisdokumentType> getMeldedatenabgleich();

} // PersoenlicheAngabenETType
