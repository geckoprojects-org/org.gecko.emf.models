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

import de.xoev.xfamilie.baukasten._1.baukasten.DatenschutzerklaerungenType;
import de.xoev.xfamilie.baukasten._1.baukasten.NachweisdokumentType;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Nachweise HZE Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.NachweiseHZEType#getSorgerechtsnachweis <em>Sorgerechtsnachweis</em>}</li>
 *   <li>{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.NachweiseHZEType#getIdentitaetsnachweis <em>Identitaetsnachweis</em>}</li>
 *   <li>{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.NachweiseHZEType#getWeitereNachweise <em>Weitere Nachweise</em>}</li>
 *   <li>{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.NachweiseHZEType#getNachweisMeldebescheinigung <em>Nachweis Meldebescheinigung</em>}</li>
 *   <li>{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.NachweiseHZEType#getAnmerkungen <em>Anmerkungen</em>}</li>
 *   <li>{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.NachweiseHZEType#getDsgvo <em>Dsgvo</em>}</li>
 *   <li>{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.NachweiseHZEType#isRichtigkeitAngaben <em>Richtigkeit Angaben</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.ErziehungshilfePackage#getNachweiseHZEType()
 * @model extendedMetaData="name='NachweiseHZEType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface NachweiseHZEType extends EObject {
	/**
	 * Returns the value of the '<em><b>Sorgerechtsnachweis</b></em>' containment reference list.
	 * The list contents are of type {@link de.xoev.xfamilie.baukasten._1.baukasten.NachweisdokumentType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Nachweise zur Geburt des Kindes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sorgerechtsnachweis</em>' containment reference list.
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.ErziehungshilfePackage#getNachweiseHZEType_Sorgerechtsnachweis()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='sorgerechtsnachweis' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<NachweisdokumentType> getSorgerechtsnachweis();

	/**
	 * Returns the value of the '<em><b>Identitaetsnachweis</b></em>' containment reference list.
	 * The list contents are of type {@link de.xoev.xfamilie.baukasten._1.baukasten.NachweisdokumentType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Nachweise zur Meldebestätigung. Nur anzugeben, wenn die Anschriften der Beteiligten voneinander abweichen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identitaetsnachweis</em>' containment reference list.
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.ErziehungshilfePackage#getNachweiseHZEType_Identitaetsnachweis()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='identitaetsnachweis' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<NachweisdokumentType> getIdentitaetsnachweis();

	/**
	 * Returns the value of the '<em><b>Weitere Nachweise</b></em>' containment reference list.
	 * The list contents are of type {@link de.xoev.xfamilie.baukasten._1.baukasten.NachweisdokumentType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angaben zu weiteren Nachweisen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Weitere Nachweise</em>' containment reference list.
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.ErziehungshilfePackage#getNachweiseHZEType_WeitereNachweise()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='weitereNachweise' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<NachweisdokumentType> getWeitereNachweise();

	/**
	 * Returns the value of the '<em><b>Nachweis Meldebescheinigung</b></em>' containment reference list.
	 * The list contents are of type {@link de.xoev.xfamilie.baukasten._1.baukasten.NachweisdokumentType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Wenn die Meldeadresse von der eingegeben Adresse mittels BundID abweicht, ist ein Nachweis in Form einer Meldebescheinigung hochzuladen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nachweis Meldebescheinigung</em>' containment reference list.
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.ErziehungshilfePackage#getNachweiseHZEType_NachweisMeldebescheinigung()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='nachweisMeldebescheinigung' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<NachweisdokumentType> getNachweisMeldebescheinigung();

	/**
	 * Returns the value of the '<em><b>Anmerkungen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Sonstige Anmerkungen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Anmerkungen</em>' attribute.
	 * @see #setAnmerkungen(String)
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.ErziehungshilfePackage#getNachweiseHZEType_Anmerkungen()
	 * @model dataType="de.xoev.kosit.datentyp._202204.din91379.DatatypeC"
	 *        extendedMetaData="kind='element' name='anmerkungen' namespace='##targetNamespace'"
	 * @generated
	 */
	String getAnmerkungen();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.NachweiseHZEType#getAnmerkungen <em>Anmerkungen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Anmerkungen</em>' attribute.
	 * @see #getAnmerkungen()
	 * @generated
	 */
	void setAnmerkungen(String value);

	/**
	 * Returns the value of the '<em><b>Dsgvo</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Bestätigung zur Datenschutzerklärung des Dienst-betreibenden Landes sowie zur spezifischen Datenschutzerklärung des nachnutzenden Landes oder der nachnutzenden Kommune.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dsgvo</em>' containment reference.
	 * @see #setDsgvo(DatenschutzerklaerungenType)
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.ErziehungshilfePackage#getNachweiseHZEType_Dsgvo()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='dsgvo' namespace='##targetNamespace'"
	 * @generated
	 */
	DatenschutzerklaerungenType getDsgvo();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.NachweiseHZEType#getDsgvo <em>Dsgvo</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dsgvo</em>' containment reference.
	 * @see #getDsgvo()
	 * @generated
	 */
	void setDsgvo(DatenschutzerklaerungenType value);

	/**
	 * Returns the value of the '<em><b>Richtigkeit Angaben</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angabe, ob die Richtigkeit der Daten bestätigt wurde oder nicht.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Richtigkeit Angaben</em>' attribute.
	 * @see #isSetRichtigkeitAngaben()
	 * @see #unsetRichtigkeitAngaben()
	 * @see #setRichtigkeitAngaben(boolean)
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.ErziehungshilfePackage#getNachweiseHZEType_RichtigkeitAngaben()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='element' name='richtigkeitAngaben' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isRichtigkeitAngaben();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.NachweiseHZEType#isRichtigkeitAngaben <em>Richtigkeit Angaben</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Richtigkeit Angaben</em>' attribute.
	 * @see #isSetRichtigkeitAngaben()
	 * @see #unsetRichtigkeitAngaben()
	 * @see #isRichtigkeitAngaben()
	 * @generated
	 */
	void setRichtigkeitAngaben(boolean value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.NachweiseHZEType#isRichtigkeitAngaben <em>Richtigkeit Angaben</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRichtigkeitAngaben()
	 * @see #isRichtigkeitAngaben()
	 * @see #setRichtigkeitAngaben(boolean)
	 * @generated
	 */
	void unsetRichtigkeitAngaben();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.NachweiseHZEType#isRichtigkeitAngaben <em>Richtigkeit Angaben</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Richtigkeit Angaben</em>' attribute is set.
	 * @see #unsetRichtigkeitAngaben()
	 * @see #isRichtigkeitAngaben()
	 * @see #setRichtigkeitAngaben(boolean)
	 * @generated
	 */
	boolean isSetRichtigkeitAngaben();

} // NachweiseHZEType
