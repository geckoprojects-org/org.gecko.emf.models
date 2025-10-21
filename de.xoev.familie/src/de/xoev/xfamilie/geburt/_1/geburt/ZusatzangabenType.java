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

import de.xoev.xfamilie.baukasten._1.baukasten.NachweisdokumentType;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Zusatzangaben Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Angaben zur Prüfung der berechtigten Antragstellung.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.geburt._1.geburt.ZusatzangabenType#isMutterIstWarMitVaterVerheiratet <em>Mutter Ist War Mit Vater Verheiratet</em>}</li>
 *   <li>{@link de.xoev.xfamilie.geburt._1.geburt.ZusatzangabenType#isGerichtlicheEntscheidungElterlicheSorgeAuchVorlaeufige <em>Gerichtliche Entscheidung Elterliche Sorge Auch Vorlaeufige</em>}</li>
 *   <li>{@link de.xoev.xfamilie.geburt._1.geburt.ZusatzangabenType#getNachweise <em>Nachweise</em>}</li>
 *   <li>{@link de.xoev.xfamilie.geburt._1.geburt.ZusatzangabenType#isMutterZumZeitpunktDerGeburtVerheiratet <em>Mutter Zum Zeitpunkt Der Geburt Verheiratet</em>}</li>
 *   <li>{@link de.xoev.xfamilie.geburt._1.geburt.ZusatzangabenType#isGemeinsameSorgeerklaerung <em>Gemeinsame Sorgeerklaerung</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.geburt._1.geburt.GeburtPackage#getZusatzangabenType()
 * @model extendedMetaData="name='ZusatzangabenType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ZusatzangabenType extends EObject {
	/**
	 * Returns the value of the '<em><b>Mutter Ist War Mit Vater Verheiratet</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angabe, ob die Mutter mit dem Vater des Kindes verheiratet war oder ist.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mutter Ist War Mit Vater Verheiratet</em>' attribute.
	 * @see #isSetMutterIstWarMitVaterVerheiratet()
	 * @see #unsetMutterIstWarMitVaterVerheiratet()
	 * @see #setMutterIstWarMitVaterVerheiratet(boolean)
	 * @see de.xoev.xfamilie.geburt._1.geburt.GeburtPackage#getZusatzangabenType_MutterIstWarMitVaterVerheiratet()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='element' name='mutterIstWarMitVaterVerheiratet' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isMutterIstWarMitVaterVerheiratet();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.geburt._1.geburt.ZusatzangabenType#isMutterIstWarMitVaterVerheiratet <em>Mutter Ist War Mit Vater Verheiratet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mutter Ist War Mit Vater Verheiratet</em>' attribute.
	 * @see #isSetMutterIstWarMitVaterVerheiratet()
	 * @see #unsetMutterIstWarMitVaterVerheiratet()
	 * @see #isMutterIstWarMitVaterVerheiratet()
	 * @generated
	 */
	void setMutterIstWarMitVaterVerheiratet(boolean value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.geburt._1.geburt.ZusatzangabenType#isMutterIstWarMitVaterVerheiratet <em>Mutter Ist War Mit Vater Verheiratet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMutterIstWarMitVaterVerheiratet()
	 * @see #isMutterIstWarMitVaterVerheiratet()
	 * @see #setMutterIstWarMitVaterVerheiratet(boolean)
	 * @generated
	 */
	void unsetMutterIstWarMitVaterVerheiratet();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.geburt._1.geburt.ZusatzangabenType#isMutterIstWarMitVaterVerheiratet <em>Mutter Ist War Mit Vater Verheiratet</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Mutter Ist War Mit Vater Verheiratet</em>' attribute is set.
	 * @see #unsetMutterIstWarMitVaterVerheiratet()
	 * @see #isMutterIstWarMitVaterVerheiratet()
	 * @see #setMutterIstWarMitVaterVerheiratet(boolean)
	 * @generated
	 */
	boolean isSetMutterIstWarMitVaterVerheiratet();

	/**
	 * Returns the value of the '<em><b>Gerichtliche Entscheidung Elterliche Sorge Auch Vorlaeufige</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angabe, ob eine gerichtliche Entscheidung über die Regelung der elterlichen Sorge getroffen wurde bzw. ob ein entsprechendes Verfahren anhängig ist.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Gerichtliche Entscheidung Elterliche Sorge Auch Vorlaeufige</em>' attribute.
	 * @see #isSetGerichtlicheEntscheidungElterlicheSorgeAuchVorlaeufige()
	 * @see #unsetGerichtlicheEntscheidungElterlicheSorgeAuchVorlaeufige()
	 * @see #setGerichtlicheEntscheidungElterlicheSorgeAuchVorlaeufige(boolean)
	 * @see de.xoev.xfamilie.geburt._1.geburt.GeburtPackage#getZusatzangabenType_GerichtlicheEntscheidungElterlicheSorgeAuchVorlaeufige()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='element' name='gerichtlicheEntscheidungElterlicheSorgeAuchVorlaeufige' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isGerichtlicheEntscheidungElterlicheSorgeAuchVorlaeufige();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.geburt._1.geburt.ZusatzangabenType#isGerichtlicheEntscheidungElterlicheSorgeAuchVorlaeufige <em>Gerichtliche Entscheidung Elterliche Sorge Auch Vorlaeufige</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gerichtliche Entscheidung Elterliche Sorge Auch Vorlaeufige</em>' attribute.
	 * @see #isSetGerichtlicheEntscheidungElterlicheSorgeAuchVorlaeufige()
	 * @see #unsetGerichtlicheEntscheidungElterlicheSorgeAuchVorlaeufige()
	 * @see #isGerichtlicheEntscheidungElterlicheSorgeAuchVorlaeufige()
	 * @generated
	 */
	void setGerichtlicheEntscheidungElterlicheSorgeAuchVorlaeufige(boolean value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.geburt._1.geburt.ZusatzangabenType#isGerichtlicheEntscheidungElterlicheSorgeAuchVorlaeufige <em>Gerichtliche Entscheidung Elterliche Sorge Auch Vorlaeufige</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetGerichtlicheEntscheidungElterlicheSorgeAuchVorlaeufige()
	 * @see #isGerichtlicheEntscheidungElterlicheSorgeAuchVorlaeufige()
	 * @see #setGerichtlicheEntscheidungElterlicheSorgeAuchVorlaeufige(boolean)
	 * @generated
	 */
	void unsetGerichtlicheEntscheidungElterlicheSorgeAuchVorlaeufige();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.geburt._1.geburt.ZusatzangabenType#isGerichtlicheEntscheidungElterlicheSorgeAuchVorlaeufige <em>Gerichtliche Entscheidung Elterliche Sorge Auch Vorlaeufige</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Gerichtliche Entscheidung Elterliche Sorge Auch Vorlaeufige</em>' attribute is set.
	 * @see #unsetGerichtlicheEntscheidungElterlicheSorgeAuchVorlaeufige()
	 * @see #isGerichtlicheEntscheidungElterlicheSorgeAuchVorlaeufige()
	 * @see #setGerichtlicheEntscheidungElterlicheSorgeAuchVorlaeufige(boolean)
	 * @generated
	 */
	boolean isSetGerichtlicheEntscheidungElterlicheSorgeAuchVorlaeufige();

	/**
	 * Returns the value of the '<em><b>Nachweise</b></em>' containment reference list.
	 * The list contents are of type {@link de.xoev.xfamilie.baukasten._1.baukasten.NachweisdokumentType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Nicht relevant, wenn der Antrag an das Register geht. Wenn ein Jugendamt mit der 0801 adressiert wird, können ggf. Nachweise (ausländische Urkunden o.ä.) mitgeschickt werden
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nachweise</em>' containment reference list.
	 * @see de.xoev.xfamilie.geburt._1.geburt.GeburtPackage#getZusatzangabenType_Nachweise()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='nachweise' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<NachweisdokumentType> getNachweise();

	/**
	 * Returns the value of the '<em><b>Mutter Zum Zeitpunkt Der Geburt Verheiratet</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angabe, ob die Mutter zum Zeitpunkt der Geburt verheiratet war. In diesen Fällen steht das Sorgerecht der Mutter und dem Ehemann (Vater) zunächst gemeinsam zu, sofern nicht beispielsweise nach § 1599 BGB das Nichtbestehen der Vaterschaft festgestellt wird.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mutter Zum Zeitpunkt Der Geburt Verheiratet</em>' attribute.
	 * @see #isSetMutterZumZeitpunktDerGeburtVerheiratet()
	 * @see #unsetMutterZumZeitpunktDerGeburtVerheiratet()
	 * @see #setMutterZumZeitpunktDerGeburtVerheiratet(boolean)
	 * @see de.xoev.xfamilie.geburt._1.geburt.GeburtPackage#getZusatzangabenType_MutterZumZeitpunktDerGeburtVerheiratet()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='mutterZumZeitpunktDerGeburtVerheiratet' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isMutterZumZeitpunktDerGeburtVerheiratet();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.geburt._1.geburt.ZusatzangabenType#isMutterZumZeitpunktDerGeburtVerheiratet <em>Mutter Zum Zeitpunkt Der Geburt Verheiratet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mutter Zum Zeitpunkt Der Geburt Verheiratet</em>' attribute.
	 * @see #isSetMutterZumZeitpunktDerGeburtVerheiratet()
	 * @see #unsetMutterZumZeitpunktDerGeburtVerheiratet()
	 * @see #isMutterZumZeitpunktDerGeburtVerheiratet()
	 * @generated
	 */
	void setMutterZumZeitpunktDerGeburtVerheiratet(boolean value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.geburt._1.geburt.ZusatzangabenType#isMutterZumZeitpunktDerGeburtVerheiratet <em>Mutter Zum Zeitpunkt Der Geburt Verheiratet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMutterZumZeitpunktDerGeburtVerheiratet()
	 * @see #isMutterZumZeitpunktDerGeburtVerheiratet()
	 * @see #setMutterZumZeitpunktDerGeburtVerheiratet(boolean)
	 * @generated
	 */
	void unsetMutterZumZeitpunktDerGeburtVerheiratet();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.geburt._1.geburt.ZusatzangabenType#isMutterZumZeitpunktDerGeburtVerheiratet <em>Mutter Zum Zeitpunkt Der Geburt Verheiratet</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Mutter Zum Zeitpunkt Der Geburt Verheiratet</em>' attribute is set.
	 * @see #unsetMutterZumZeitpunktDerGeburtVerheiratet()
	 * @see #isMutterZumZeitpunktDerGeburtVerheiratet()
	 * @see #setMutterZumZeitpunktDerGeburtVerheiratet(boolean)
	 * @generated
	 */
	boolean isSetMutterZumZeitpunktDerGeburtVerheiratet();

	/**
	 * Returns the value of the '<em><b>Gemeinsame Sorgeerklaerung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angabe, ob die Elternteile eine gemeinsame Sorgererklärung gemäß § 1626a Abs.1 S. 1 BGB abgegeben haben..
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Gemeinsame Sorgeerklaerung</em>' attribute.
	 * @see #isSetGemeinsameSorgeerklaerung()
	 * @see #unsetGemeinsameSorgeerklaerung()
	 * @see #setGemeinsameSorgeerklaerung(boolean)
	 * @see de.xoev.xfamilie.geburt._1.geburt.GeburtPackage#getZusatzangabenType_GemeinsameSorgeerklaerung()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='gemeinsameSorgeerklaerung' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isGemeinsameSorgeerklaerung();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.geburt._1.geburt.ZusatzangabenType#isGemeinsameSorgeerklaerung <em>Gemeinsame Sorgeerklaerung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gemeinsame Sorgeerklaerung</em>' attribute.
	 * @see #isSetGemeinsameSorgeerklaerung()
	 * @see #unsetGemeinsameSorgeerklaerung()
	 * @see #isGemeinsameSorgeerklaerung()
	 * @generated
	 */
	void setGemeinsameSorgeerklaerung(boolean value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.geburt._1.geburt.ZusatzangabenType#isGemeinsameSorgeerklaerung <em>Gemeinsame Sorgeerklaerung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetGemeinsameSorgeerklaerung()
	 * @see #isGemeinsameSorgeerklaerung()
	 * @see #setGemeinsameSorgeerklaerung(boolean)
	 * @generated
	 */
	void unsetGemeinsameSorgeerklaerung();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.geburt._1.geburt.ZusatzangabenType#isGemeinsameSorgeerklaerung <em>Gemeinsame Sorgeerklaerung</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Gemeinsame Sorgeerklaerung</em>' attribute is set.
	 * @see #unsetGemeinsameSorgeerklaerung()
	 * @see #isGemeinsameSorgeerklaerung()
	 * @see #setGemeinsameSorgeerklaerung(boolean)
	 * @generated
	 */
	boolean isSetGemeinsameSorgeerklaerung();

} // ZusatzangabenType
