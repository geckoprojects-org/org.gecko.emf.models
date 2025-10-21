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
package de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen;

import de.xoev.xfamilie.baukasten._1.baukasten.NameNatuerlichePersonVornameVerpflichtendType;
import de.xoev.xfamilie.baukasten._1.baukasten.PostalischeInlandsanschriftBasisType;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Persoenliche Angaben Eingliederung Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.PersoenlicheAngabenEingliederungType#getNamen <em>Namen</em>}</li>
 *   <li>{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.PersoenlicheAngabenEingliederungType#getGeburtsdatum <em>Geburtsdatum</em>}</li>
 *   <li>{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.PersoenlicheAngabenEingliederungType#getAktuelleAnschrift <em>Aktuelle Anschrift</em>}</li>
 *   <li>{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.PersoenlicheAngabenEingliederungType#isAnschriftsaenderung <em>Anschriftsaenderung</em>}</li>
 *   <li>{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.PersoenlicheAngabenEingliederungType#isWeichtAnschriftAb <em>Weicht Anschrift Ab</em>}</li>
 *   <li>{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.PersoenlicheAngabenEingliederungType#getAbweichendeAnschrift <em>Abweichende Anschrift</em>}</li>
 *   <li>{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.PersoenlicheAngabenEingliederungType#getKontaktdaten <em>Kontaktdaten</em>}</li>
 *   <li>{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.PersoenlicheAngabenEingliederungType#isSeelischeBehinderung <em>Seelische Behinderung</em>}</li>
 *   <li>{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.PersoenlicheAngabenEingliederungType#getArtDerBehinderung <em>Art Der Behinderung</em>}</li>
 *   <li>{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.PersoenlicheAngabenEingliederungType#isAerztlicherNachweis <em>Aerztlicher Nachweis</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.ErziehungshilfePackage#getPersoenlicheAngabenEingliederungType()
 * @model extendedMetaData="name='PersoenlicheAngabenEingliederungType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface PersoenlicheAngabenEingliederungType extends EObject {
	/**
	 * Returns the value of the '<em><b>Namen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Namen</em>' containment reference.
	 * @see #setNamen(NameNatuerlichePersonVornameVerpflichtendType)
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.ErziehungshilfePackage#getPersoenlicheAngabenEingliederungType_Namen()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='namen' namespace='##targetNamespace'"
	 * @generated
	 */
	NameNatuerlichePersonVornameVerpflichtendType getNamen();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.PersoenlicheAngabenEingliederungType#getNamen <em>Namen</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Namen</em>' containment reference.
	 * @see #getNamen()
	 * @generated
	 */
	void setNamen(NameNatuerlichePersonVornameVerpflichtendType value);

	/**
	 * Returns the value of the '<em><b>Geburtsdatum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Geburtsdatum</em>' attribute.
	 * @see #setGeburtsdatum(XMLGregorianCalendar)
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.ErziehungshilfePackage#getPersoenlicheAngabenEingliederungType_Geburtsdatum()
	 * @model dataType="de.xoev.xfamilie.baukasten._1.baukasten.TagesdatumType" required="true"
	 *        extendedMetaData="kind='element' name='geburtsdatum' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getGeburtsdatum();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.PersoenlicheAngabenEingliederungType#getGeburtsdatum <em>Geburtsdatum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Geburtsdatum</em>' attribute.
	 * @see #getGeburtsdatum()
	 * @generated
	 */
	void setGeburtsdatum(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Aktuelle Anschrift</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aktuelle Anschrift</em>' containment reference.
	 * @see #setAktuelleAnschrift(PostalischeInlandsanschriftBasisType)
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.ErziehungshilfePackage#getPersoenlicheAngabenEingliederungType_AktuelleAnschrift()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='aktuelleAnschrift' namespace='##targetNamespace'"
	 * @generated
	 */
	PostalischeInlandsanschriftBasisType getAktuelleAnschrift();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.PersoenlicheAngabenEingliederungType#getAktuelleAnschrift <em>Aktuelle Anschrift</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aktuelle Anschrift</em>' containment reference.
	 * @see #getAktuelleAnschrift()
	 * @generated
	 */
	void setAktuelleAnschrift(PostalischeInlandsanschriftBasisType value);

	/**
	 * Returns the value of the '<em><b>Anschriftsaenderung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Hat sich Ihr Aufenthalt in den letzten 6 Monaten geändert? 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Anschriftsaenderung</em>' attribute.
	 * @see #isSetAnschriftsaenderung()
	 * @see #unsetAnschriftsaenderung()
	 * @see #setAnschriftsaenderung(boolean)
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.ErziehungshilfePackage#getPersoenlicheAngabenEingliederungType_Anschriftsaenderung()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='element' name='anschriftsaenderung' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isAnschriftsaenderung();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.PersoenlicheAngabenEingliederungType#isAnschriftsaenderung <em>Anschriftsaenderung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Anschriftsaenderung</em>' attribute.
	 * @see #isSetAnschriftsaenderung()
	 * @see #unsetAnschriftsaenderung()
	 * @see #isAnschriftsaenderung()
	 * @generated
	 */
	void setAnschriftsaenderung(boolean value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.PersoenlicheAngabenEingliederungType#isAnschriftsaenderung <em>Anschriftsaenderung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAnschriftsaenderung()
	 * @see #isAnschriftsaenderung()
	 * @see #setAnschriftsaenderung(boolean)
	 * @generated
	 */
	void unsetAnschriftsaenderung();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.PersoenlicheAngabenEingliederungType#isAnschriftsaenderung <em>Anschriftsaenderung</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Anschriftsaenderung</em>' attribute is set.
	 * @see #unsetAnschriftsaenderung()
	 * @see #isAnschriftsaenderung()
	 * @see #setAnschriftsaenderung(boolean)
	 * @generated
	 */
	boolean isSetAnschriftsaenderung();

	/**
	 * Returns the value of the '<em><b>Weicht Anschrift Ab</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * WENN weichtAnschriftAb = true, DANN muss abweichende Anschrift befüllt sein.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Weicht Anschrift Ab</em>' attribute.
	 * @see #isSetWeichtAnschriftAb()
	 * @see #unsetWeichtAnschriftAb()
	 * @see #setWeichtAnschriftAb(boolean)
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.ErziehungshilfePackage#getPersoenlicheAngabenEingliederungType_WeichtAnschriftAb()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='weichtAnschriftAb' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isWeichtAnschriftAb();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.PersoenlicheAngabenEingliederungType#isWeichtAnschriftAb <em>Weicht Anschrift Ab</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Weicht Anschrift Ab</em>' attribute.
	 * @see #isSetWeichtAnschriftAb()
	 * @see #unsetWeichtAnschriftAb()
	 * @see #isWeichtAnschriftAb()
	 * @generated
	 */
	void setWeichtAnschriftAb(boolean value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.PersoenlicheAngabenEingliederungType#isWeichtAnschriftAb <em>Weicht Anschrift Ab</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetWeichtAnschriftAb()
	 * @see #isWeichtAnschriftAb()
	 * @see #setWeichtAnschriftAb(boolean)
	 * @generated
	 */
	void unsetWeichtAnschriftAb();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.PersoenlicheAngabenEingliederungType#isWeichtAnschriftAb <em>Weicht Anschrift Ab</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Weicht Anschrift Ab</em>' attribute is set.
	 * @see #unsetWeichtAnschriftAb()
	 * @see #isWeichtAnschriftAb()
	 * @see #setWeichtAnschriftAb(boolean)
	 * @generated
	 */
	boolean isSetWeichtAnschriftAb();

	/**
	 * Returns the value of the '<em><b>Abweichende Anschrift</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * WENN weichtAnschriftAb = true, DANN muss abweichendeAnschrift befüllt sein.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Abweichende Anschrift</em>' containment reference.
	 * @see #setAbweichendeAnschrift(PostalischeInlandsanschriftBasisType)
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.ErziehungshilfePackage#getPersoenlicheAngabenEingliederungType_AbweichendeAnschrift()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='abweichendeAnschrift' namespace='##targetNamespace'"
	 * @generated
	 */
	PostalischeInlandsanschriftBasisType getAbweichendeAnschrift();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.PersoenlicheAngabenEingliederungType#getAbweichendeAnschrift <em>Abweichende Anschrift</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abweichende Anschrift</em>' containment reference.
	 * @see #getAbweichendeAnschrift()
	 * @generated
	 */
	void setAbweichendeAnschrift(PostalischeInlandsanschriftBasisType value);

	/**
	 * Returns the value of the '<em><b>Kontaktdaten</b></em>' containment reference list.
	 * The list contents are of type {@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.ErreichbarkeitHZEType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kontaktdaten</em>' containment reference list.
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.ErziehungshilfePackage#getPersoenlicheAngabenEingliederungType_Kontaktdaten()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='kontaktdaten' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ErreichbarkeitHZEType> getKontaktdaten();

	/**
	 * Returns the value of the '<em><b>Seelische Behinderung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Seelische Behinderung</em>' attribute.
	 * @see #isSetSeelischeBehinderung()
	 * @see #unsetSeelischeBehinderung()
	 * @see #setSeelischeBehinderung(boolean)
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.ErziehungshilfePackage#getPersoenlicheAngabenEingliederungType_SeelischeBehinderung()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='seelischeBehinderung' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isSeelischeBehinderung();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.PersoenlicheAngabenEingliederungType#isSeelischeBehinderung <em>Seelische Behinderung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Seelische Behinderung</em>' attribute.
	 * @see #isSetSeelischeBehinderung()
	 * @see #unsetSeelischeBehinderung()
	 * @see #isSeelischeBehinderung()
	 * @generated
	 */
	void setSeelischeBehinderung(boolean value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.PersoenlicheAngabenEingliederungType#isSeelischeBehinderung <em>Seelische Behinderung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSeelischeBehinderung()
	 * @see #isSeelischeBehinderung()
	 * @see #setSeelischeBehinderung(boolean)
	 * @generated
	 */
	void unsetSeelischeBehinderung();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.PersoenlicheAngabenEingliederungType#isSeelischeBehinderung <em>Seelische Behinderung</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Seelische Behinderung</em>' attribute is set.
	 * @see #unsetSeelischeBehinderung()
	 * @see #isSeelischeBehinderung()
	 * @see #setSeelischeBehinderung(boolean)
	 * @generated
	 */
	boolean isSetSeelischeBehinderung();

	/**
	 * Returns the value of the '<em><b>Art Der Behinderung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Art Der Behinderung</em>' attribute.
	 * @see #setArtDerBehinderung(String)
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.ErziehungshilfePackage#getPersoenlicheAngabenEingliederungType_ArtDerBehinderung()
	 * @model dataType="de.xoev.kosit.datentyp._202204.din91379.DatatypeC"
	 *        extendedMetaData="kind='element' name='artDerBehinderung' namespace='##targetNamespace'"
	 * @generated
	 */
	String getArtDerBehinderung();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.PersoenlicheAngabenEingliederungType#getArtDerBehinderung <em>Art Der Behinderung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Art Der Behinderung</em>' attribute.
	 * @see #getArtDerBehinderung()
	 * @generated
	 */
	void setArtDerBehinderung(String value);

	/**
	 * Returns the value of the '<em><b>Aerztlicher Nachweis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aerztlicher Nachweis</em>' attribute.
	 * @see #isSetAerztlicherNachweis()
	 * @see #unsetAerztlicherNachweis()
	 * @see #setAerztlicherNachweis(boolean)
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.ErziehungshilfePackage#getPersoenlicheAngabenEingliederungType_AerztlicherNachweis()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='aerztlicherNachweis' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isAerztlicherNachweis();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.PersoenlicheAngabenEingliederungType#isAerztlicherNachweis <em>Aerztlicher Nachweis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aerztlicher Nachweis</em>' attribute.
	 * @see #isSetAerztlicherNachweis()
	 * @see #unsetAerztlicherNachweis()
	 * @see #isAerztlicherNachweis()
	 * @generated
	 */
	void setAerztlicherNachweis(boolean value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.PersoenlicheAngabenEingliederungType#isAerztlicherNachweis <em>Aerztlicher Nachweis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAerztlicherNachweis()
	 * @see #isAerztlicherNachweis()
	 * @see #setAerztlicherNachweis(boolean)
	 * @generated
	 */
	void unsetAerztlicherNachweis();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.PersoenlicheAngabenEingliederungType#isAerztlicherNachweis <em>Aerztlicher Nachweis</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Aerztlicher Nachweis</em>' attribute is set.
	 * @see #unsetAerztlicherNachweis()
	 * @see #isAerztlicherNachweis()
	 * @see #setAerztlicherNachweis(boolean)
	 * @generated
	 */
	boolean isSetAerztlicherNachweis();

} // PersoenlicheAngabenEingliederungType
