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

import java.math.BigInteger;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Geringes Einkommen Covid19 Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.GeringesEinkommenCovid19Type#isGeringesEinkommenCovid19 <em>Geringes Einkommen Covid19</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.GeringesEinkommenCovid19Type#isAntragAusklammerungMonateNichtselbststaendige <em>Antrag Ausklammerung Monate Nichtselbststaendige</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.GeringesEinkommenCovid19Type#getZeitraum <em>Zeitraum</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.GeringesEinkommenCovid19Type#isAntragVerschiebungBemessungszeitraumesSelbststaendige <em>Antrag Verschiebung Bemessungszeitraumes Selbststaendige</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.GeringesEinkommenCovid19Type#getVerschiebungBemessungszeitraumesSelbststaendige <em>Verschiebung Bemessungszeitraumes Selbststaendige</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.GeringesEinkommenCovid19Type#getNachweisGeringesEinkommenCovid19 <em>Nachweis Geringes Einkommen Covid19</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getGeringesEinkommenCovid19Type()
 * @model extendedMetaData="name='GeringesEinkommenCovid19Type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface GeringesEinkommenCovid19Type extends EObject {
	/**
	 * Returns the value of the '<em><b>Geringes Einkommen Covid19</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Geringes Einkommen Covid19</em>' attribute.
	 * @see #isSetGeringesEinkommenCovid19()
	 * @see #unsetGeringesEinkommenCovid19()
	 * @see #setGeringesEinkommenCovid19(boolean)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getGeringesEinkommenCovid19Type_GeringesEinkommenCovid19()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='element' name='geringesEinkommenCovid19' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isGeringesEinkommenCovid19();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.GeringesEinkommenCovid19Type#isGeringesEinkommenCovid19 <em>Geringes Einkommen Covid19</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Geringes Einkommen Covid19</em>' attribute.
	 * @see #isSetGeringesEinkommenCovid19()
	 * @see #unsetGeringesEinkommenCovid19()
	 * @see #isGeringesEinkommenCovid19()
	 * @generated
	 */
	void setGeringesEinkommenCovid19(boolean value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.GeringesEinkommenCovid19Type#isGeringesEinkommenCovid19 <em>Geringes Einkommen Covid19</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetGeringesEinkommenCovid19()
	 * @see #isGeringesEinkommenCovid19()
	 * @see #setGeringesEinkommenCovid19(boolean)
	 * @generated
	 */
	void unsetGeringesEinkommenCovid19();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.GeringesEinkommenCovid19Type#isGeringesEinkommenCovid19 <em>Geringes Einkommen Covid19</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Geringes Einkommen Covid19</em>' attribute is set.
	 * @see #unsetGeringesEinkommenCovid19()
	 * @see #isGeringesEinkommenCovid19()
	 * @see #setGeringesEinkommenCovid19(boolean)
	 * @generated
	 */
	boolean isSetGeringesEinkommenCovid19();

	/**
	 * Returns the value of the '<em><b>Antrag Ausklammerung Monate Nichtselbststaendige</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Antrag Ausklammerung Monate Nichtselbststaendige</em>' attribute.
	 * @see #isSetAntragAusklammerungMonateNichtselbststaendige()
	 * @see #unsetAntragAusklammerungMonateNichtselbststaendige()
	 * @see #setAntragAusklammerungMonateNichtselbststaendige(boolean)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getGeringesEinkommenCovid19Type_AntragAusklammerungMonateNichtselbststaendige()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='antragAusklammerungMonateNichtselbststaendige' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isAntragAusklammerungMonateNichtselbststaendige();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.GeringesEinkommenCovid19Type#isAntragAusklammerungMonateNichtselbststaendige <em>Antrag Ausklammerung Monate Nichtselbststaendige</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Antrag Ausklammerung Monate Nichtselbststaendige</em>' attribute.
	 * @see #isSetAntragAusklammerungMonateNichtselbststaendige()
	 * @see #unsetAntragAusklammerungMonateNichtselbststaendige()
	 * @see #isAntragAusklammerungMonateNichtselbststaendige()
	 * @generated
	 */
	void setAntragAusklammerungMonateNichtselbststaendige(boolean value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.GeringesEinkommenCovid19Type#isAntragAusklammerungMonateNichtselbststaendige <em>Antrag Ausklammerung Monate Nichtselbststaendige</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAntragAusklammerungMonateNichtselbststaendige()
	 * @see #isAntragAusklammerungMonateNichtselbststaendige()
	 * @see #setAntragAusklammerungMonateNichtselbststaendige(boolean)
	 * @generated
	 */
	void unsetAntragAusklammerungMonateNichtselbststaendige();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.GeringesEinkommenCovid19Type#isAntragAusklammerungMonateNichtselbststaendige <em>Antrag Ausklammerung Monate Nichtselbststaendige</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Antrag Ausklammerung Monate Nichtselbststaendige</em>' attribute is set.
	 * @see #unsetAntragAusklammerungMonateNichtselbststaendige()
	 * @see #isAntragAusklammerungMonateNichtselbststaendige()
	 * @see #setAntragAusklammerungMonateNichtselbststaendige(boolean)
	 * @generated
	 */
	boolean isSetAntragAusklammerungMonateNichtselbststaendige();

	/**
	 * Returns the value of the '<em><b>Zeitraum</b></em>' containment reference list.
	 * The list contents are of type {@link de.xoev.xfamilie.baukasten._1.baukasten.ZeitraumType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Zeitraum</em>' containment reference list.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getGeringesEinkommenCovid19Type_Zeitraum()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='zeitraum' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ZeitraumType> getZeitraum();

	/**
	 * Returns the value of the '<em><b>Antrag Verschiebung Bemessungszeitraumes Selbststaendige</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Antrag Verschiebung Bemessungszeitraumes Selbststaendige</em>' attribute.
	 * @see #isSetAntragVerschiebungBemessungszeitraumesSelbststaendige()
	 * @see #unsetAntragVerschiebungBemessungszeitraumesSelbststaendige()
	 * @see #setAntragVerschiebungBemessungszeitraumesSelbststaendige(boolean)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getGeringesEinkommenCovid19Type_AntragVerschiebungBemessungszeitraumesSelbststaendige()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='antragVerschiebungBemessungszeitraumesSelbststaendige' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isAntragVerschiebungBemessungszeitraumesSelbststaendige();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.GeringesEinkommenCovid19Type#isAntragVerschiebungBemessungszeitraumesSelbststaendige <em>Antrag Verschiebung Bemessungszeitraumes Selbststaendige</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Antrag Verschiebung Bemessungszeitraumes Selbststaendige</em>' attribute.
	 * @see #isSetAntragVerschiebungBemessungszeitraumesSelbststaendige()
	 * @see #unsetAntragVerschiebungBemessungszeitraumesSelbststaendige()
	 * @see #isAntragVerschiebungBemessungszeitraumesSelbststaendige()
	 * @generated
	 */
	void setAntragVerschiebungBemessungszeitraumesSelbststaendige(boolean value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.GeringesEinkommenCovid19Type#isAntragVerschiebungBemessungszeitraumesSelbststaendige <em>Antrag Verschiebung Bemessungszeitraumes Selbststaendige</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAntragVerschiebungBemessungszeitraumesSelbststaendige()
	 * @see #isAntragVerschiebungBemessungszeitraumesSelbststaendige()
	 * @see #setAntragVerschiebungBemessungszeitraumesSelbststaendige(boolean)
	 * @generated
	 */
	void unsetAntragVerschiebungBemessungszeitraumesSelbststaendige();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.GeringesEinkommenCovid19Type#isAntragVerschiebungBemessungszeitraumesSelbststaendige <em>Antrag Verschiebung Bemessungszeitraumes Selbststaendige</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Antrag Verschiebung Bemessungszeitraumes Selbststaendige</em>' attribute is set.
	 * @see #unsetAntragVerschiebungBemessungszeitraumesSelbststaendige()
	 * @see #isAntragVerschiebungBemessungszeitraumesSelbststaendige()
	 * @see #setAntragVerschiebungBemessungszeitraumesSelbststaendige(boolean)
	 * @generated
	 */
	boolean isSetAntragVerschiebungBemessungszeitraumesSelbststaendige();

	/**
	 * Returns the value of the '<em><b>Verschiebung Bemessungszeitraumes Selbststaendige</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Verschiebung Bemessungszeitraumes Selbststaendige</em>' attribute.
	 * @see #setVerschiebungBemessungszeitraumesSelbststaendige(BigInteger)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getGeringesEinkommenCovid19Type_VerschiebungBemessungszeitraumesSelbststaendige()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NonNegativeInteger"
	 *        extendedMetaData="kind='element' name='verschiebungBemessungszeitraumesSelbststaendige' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getVerschiebungBemessungszeitraumesSelbststaendige();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.GeringesEinkommenCovid19Type#getVerschiebungBemessungszeitraumesSelbststaendige <em>Verschiebung Bemessungszeitraumes Selbststaendige</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Verschiebung Bemessungszeitraumes Selbststaendige</em>' attribute.
	 * @see #getVerschiebungBemessungszeitraumesSelbststaendige()
	 * @generated
	 */
	void setVerschiebungBemessungszeitraumesSelbststaendige(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Nachweis Geringes Einkommen Covid19</b></em>' containment reference list.
	 * The list contents are of type {@link de.xoev.xfamilie.baukasten._1.baukasten.NachweisdokumentType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Von den Antragstellenden im Antragsservice bereitgestellte Nachweisdokumente (hochgeladene Fotos, Scans, etc.). Siehe auch .
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nachweis Geringes Einkommen Covid19</em>' containment reference list.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getGeringesEinkommenCovid19Type_NachweisGeringesEinkommenCovid19()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='nachweisGeringesEinkommenCovid19' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<NachweisdokumentType> getNachweisGeringesEinkommenCovid19();

} // GeringesEinkommenCovid19Type
