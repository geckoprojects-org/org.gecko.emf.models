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

import de.xoev.xfamilie.baukasten._1.baukasten.ErreichbarkeitType;
import de.xoev.xfamilie.baukasten._1.baukasten.NameNatuerlichePersonVornameVerpflichtendType;
import de.xoev.xfamilie.baukasten._1.baukasten.PostalischeInlandsanschriftBasisType;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Antragstellender ET Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AntragstellenderETType#getNamen <em>Namen</em>}</li>
 *   <li>{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AntragstellenderETType#getGeburtsort <em>Geburtsort</em>}</li>
 *   <li>{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AntragstellenderETType#getGeburtsdatum <em>Geburtsdatum</em>}</li>
 *   <li>{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AntragstellenderETType#getAdresse <em>Adresse</em>}</li>
 *   <li>{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AntragstellenderETType#isAbweichendeAdresse <em>Abweichende Adresse</em>}</li>
 *   <li>{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AntragstellenderETType#getAbweichendeAdressePerso <em>Abweichende Adresse Perso</em>}</li>
 *   <li>{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AntragstellenderETType#getKontaktdaten <em>Kontaktdaten</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.ErziehungshilfePackage#getAntragstellenderETType()
 * @model extendedMetaData="name='AntragstellenderETType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface AntragstellenderETType extends EObject {
	/**
	 * Returns the value of the '<em><b>Namen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Namen</em>' containment reference.
	 * @see #setNamen(NameNatuerlichePersonVornameVerpflichtendType)
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.ErziehungshilfePackage#getAntragstellenderETType_Namen()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='namen' namespace='##targetNamespace'"
	 * @generated
	 */
	NameNatuerlichePersonVornameVerpflichtendType getNamen();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AntragstellenderETType#getNamen <em>Namen</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Namen</em>' containment reference.
	 * @see #getNamen()
	 * @generated
	 */
	void setNamen(NameNatuerlichePersonVornameVerpflichtendType value);

	/**
	 * Returns the value of the '<em><b>Geburtsort</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Geburtsort</em>' attribute.
	 * @see #setGeburtsort(String)
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.ErziehungshilfePackage#getAntragstellenderETType_Geburtsort()
	 * @model dataType="de.xoev.kosit.datentyp._202204.din91379.DatatypeC"
	 *        extendedMetaData="kind='element' name='geburtsort' namespace='##targetNamespace'"
	 * @generated
	 */
	String getGeburtsort();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AntragstellenderETType#getGeburtsort <em>Geburtsort</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Geburtsort</em>' attribute.
	 * @see #getGeburtsort()
	 * @generated
	 */
	void setGeburtsort(String value);

	/**
	 * Returns the value of the '<em><b>Geburtsdatum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Geburtsdatum</em>' attribute.
	 * @see #setGeburtsdatum(XMLGregorianCalendar)
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.ErziehungshilfePackage#getAntragstellenderETType_Geburtsdatum()
	 * @model dataType="de.xoev.xfamilie.baukasten._1.baukasten.TagesdatumType" required="true"
	 *        extendedMetaData="kind='element' name='geburtsdatum' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getGeburtsdatum();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AntragstellenderETType#getGeburtsdatum <em>Geburtsdatum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Geburtsdatum</em>' attribute.
	 * @see #getGeburtsdatum()
	 * @generated
	 */
	void setGeburtsdatum(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Adresse</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Adresse</em>' containment reference.
	 * @see #setAdresse(PostalischeInlandsanschriftBasisType)
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.ErziehungshilfePackage#getAntragstellenderETType_Adresse()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='adresse' namespace='##targetNamespace'"
	 * @generated
	 */
	PostalischeInlandsanschriftBasisType getAdresse();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AntragstellenderETType#getAdresse <em>Adresse</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Adresse</em>' containment reference.
	 * @see #getAdresse()
	 * @generated
	 */
	void setAdresse(PostalischeInlandsanschriftBasisType value);

	/**
	 * Returns the value of the '<em><b>Abweichende Adresse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angabe, ob die Anschrift von der im Personalausweis angegebenen Anschrift abweicht. True: Optionales Element abweichendeAdressePerso befüllen
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Abweichende Adresse</em>' attribute.
	 * @see #isSetAbweichendeAdresse()
	 * @see #unsetAbweichendeAdresse()
	 * @see #setAbweichendeAdresse(boolean)
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.ErziehungshilfePackage#getAntragstellenderETType_AbweichendeAdresse()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='element' name='abweichendeAdresse' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isAbweichendeAdresse();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AntragstellenderETType#isAbweichendeAdresse <em>Abweichende Adresse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abweichende Adresse</em>' attribute.
	 * @see #isSetAbweichendeAdresse()
	 * @see #unsetAbweichendeAdresse()
	 * @see #isAbweichendeAdresse()
	 * @generated
	 */
	void setAbweichendeAdresse(boolean value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AntragstellenderETType#isAbweichendeAdresse <em>Abweichende Adresse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAbweichendeAdresse()
	 * @see #isAbweichendeAdresse()
	 * @see #setAbweichendeAdresse(boolean)
	 * @generated
	 */
	void unsetAbweichendeAdresse();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AntragstellenderETType#isAbweichendeAdresse <em>Abweichende Adresse</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Abweichende Adresse</em>' attribute is set.
	 * @see #unsetAbweichendeAdresse()
	 * @see #isAbweichendeAdresse()
	 * @see #setAbweichendeAdresse(boolean)
	 * @generated
	 */
	boolean isSetAbweichendeAdresse();

	/**
	 * Returns the value of the '<em><b>Abweichende Adresse Perso</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abweichende Adresse Perso</em>' containment reference.
	 * @see #setAbweichendeAdressePerso(PostalischeInlandsanschriftBasisType)
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.ErziehungshilfePackage#getAntragstellenderETType_AbweichendeAdressePerso()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='abweichendeAdressePerso' namespace='##targetNamespace'"
	 * @generated
	 */
	PostalischeInlandsanschriftBasisType getAbweichendeAdressePerso();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AntragstellenderETType#getAbweichendeAdressePerso <em>Abweichende Adresse Perso</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abweichende Adresse Perso</em>' containment reference.
	 * @see #getAbweichendeAdressePerso()
	 * @generated
	 */
	void setAbweichendeAdressePerso(PostalischeInlandsanschriftBasisType value);

	/**
	 * Returns the value of the '<em><b>Kontaktdaten</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kontaktdaten</em>' containment reference.
	 * @see #setKontaktdaten(ErreichbarkeitType)
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.ErziehungshilfePackage#getAntragstellenderETType_Kontaktdaten()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='kontaktdaten' namespace='##targetNamespace'"
	 * @generated
	 */
	ErreichbarkeitType getKontaktdaten();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AntragstellenderETType#getKontaktdaten <em>Kontaktdaten</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kontaktdaten</em>' containment reference.
	 * @see #getKontaktdaten()
	 * @generated
	 */
	void setKontaktdaten(ErreichbarkeitType value);

} // AntragstellenderETType
