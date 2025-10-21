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
package de.xoev.xfamilie.beistandschaft._1.beistandschaft;

import de.xoev.xfamilie.baukasten._1.baukasten.CodeFamilienstandType;
import de.xoev.xfamilie.baukasten._1.baukasten.ErreichbarkeitType;
import de.xoev.xfamilie.baukasten._1.baukasten.NameNatuerlichePersonType;
import de.xoev.xfamilie.baukasten._1.baukasten.PostalischeInlandsanschriftBasisType;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Anderer Elternteil Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AndererElternteilType#isAngabenZumAnderenElternteil <em>Angaben Zum Anderen Elternteil</em>}</li>
 *   <li>{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AndererElternteilType#getNamen <em>Namen</em>}</li>
 *   <li>{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AndererElternteilType#getGeburtsdaten <em>Geburtsdaten</em>}</li>
 *   <li>{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AndererElternteilType#getFamilienstand <em>Familienstand</em>}</li>
 *   <li>{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AndererElternteilType#isAngabenZurAdresse <em>Angaben Zur Adresse</em>}</li>
 *   <li>{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AndererElternteilType#getAdresse <em>Adresse</em>}</li>
 *   <li>{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AndererElternteilType#getErreichbarkeit <em>Erreichbarkeit</em>}</li>
 *   <li>{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AndererElternteilType#isAnerkennungVaterschaft <em>Anerkennung Vaterschaft</em>}</li>
 *   <li>{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AndererElternteilType#getWeitereAngabenzumAnderenElternteil <em>Weitere Angabenzum Anderen Elternteil</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.BeistandschaftPackage#getAndererElternteilType()
 * @model extendedMetaData="name='AndererElternteilType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface AndererElternteilType extends EObject {
	/**
	 * Returns the value of the '<em><b>Angaben Zum Anderen Elternteil</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Können Sie Angaben zum anderen Elternteil machen? If true: Weitere Angaben in diesem Element optional auszufüllen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Angaben Zum Anderen Elternteil</em>' attribute.
	 * @see #isSetAngabenZumAnderenElternteil()
	 * @see #unsetAngabenZumAnderenElternteil()
	 * @see #setAngabenZumAnderenElternteil(boolean)
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.BeistandschaftPackage#getAndererElternteilType_AngabenZumAnderenElternteil()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='element' name='angabenZumAnderenElternteil' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isAngabenZumAnderenElternteil();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AndererElternteilType#isAngabenZumAnderenElternteil <em>Angaben Zum Anderen Elternteil</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Angaben Zum Anderen Elternteil</em>' attribute.
	 * @see #isSetAngabenZumAnderenElternteil()
	 * @see #unsetAngabenZumAnderenElternteil()
	 * @see #isAngabenZumAnderenElternteil()
	 * @generated
	 */
	void setAngabenZumAnderenElternteil(boolean value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AndererElternteilType#isAngabenZumAnderenElternteil <em>Angaben Zum Anderen Elternteil</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAngabenZumAnderenElternteil()
	 * @see #isAngabenZumAnderenElternteil()
	 * @see #setAngabenZumAnderenElternteil(boolean)
	 * @generated
	 */
	void unsetAngabenZumAnderenElternteil();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AndererElternteilType#isAngabenZumAnderenElternteil <em>Angaben Zum Anderen Elternteil</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Angaben Zum Anderen Elternteil</em>' attribute is set.
	 * @see #unsetAngabenZumAnderenElternteil()
	 * @see #isAngabenZumAnderenElternteil()
	 * @see #setAngabenZumAnderenElternteil(boolean)
	 * @generated
	 */
	boolean isSetAngabenZumAnderenElternteil();

	/**
	 * Returns the value of the '<em><b>Namen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Namen</em>' containment reference.
	 * @see #setNamen(NameNatuerlichePersonType)
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.BeistandschaftPackage#getAndererElternteilType_Namen()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='namen' namespace='##targetNamespace'"
	 * @generated
	 */
	NameNatuerlichePersonType getNamen();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AndererElternteilType#getNamen <em>Namen</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Namen</em>' containment reference.
	 * @see #getNamen()
	 * @generated
	 */
	void setNamen(NameNatuerlichePersonType value);

	/**
	 * Returns the value of the '<em><b>Geburtsdaten</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Das optionale Element Geburtsstaat wird hier nicht benötigt.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Geburtsdaten</em>' containment reference.
	 * @see #setGeburtsdaten(GeburtType)
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.BeistandschaftPackage#getAndererElternteilType_Geburtsdaten()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='geburtsdaten' namespace='##targetNamespace'"
	 * @generated
	 */
	GeburtType getGeburtsdaten();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AndererElternteilType#getGeburtsdaten <em>Geburtsdaten</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Geburtsdaten</em>' containment reference.
	 * @see #getGeburtsdaten()
	 * @generated
	 */
	void setGeburtsdaten(GeburtType value);

	/**
	 * Returns the value of the '<em><b>Familienstand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angaben zum Familienstand: An dieser Stelle sind nur die Angaben ledig, verheiratet, geschieden, verwitwet, eingetragene Lebenspartnerschaft, aufgehobene Lebenspartnerschaft und durch Tod aufgelöste Partnerschaft zulässig.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Familienstand</em>' containment reference.
	 * @see #setFamilienstand(CodeFamilienstandType)
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.BeistandschaftPackage#getAndererElternteilType_Familienstand()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='familienstand' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeFamilienstandType getFamilienstand();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AndererElternteilType#getFamilienstand <em>Familienstand</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Familienstand</em>' containment reference.
	 * @see #getFamilienstand()
	 * @generated
	 */
	void setFamilienstand(CodeFamilienstandType value);

	/**
	 * Returns the value of the '<em><b>Angaben Zur Adresse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Kennen Sie die Adresse des anderen Elternteils? If true: Adressfeld ausfüllen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Angaben Zur Adresse</em>' attribute.
	 * @see #isSetAngabenZurAdresse()
	 * @see #unsetAngabenZurAdresse()
	 * @see #setAngabenZurAdresse(boolean)
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.BeistandschaftPackage#getAndererElternteilType_AngabenZurAdresse()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='angabenZurAdresse' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isAngabenZurAdresse();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AndererElternteilType#isAngabenZurAdresse <em>Angaben Zur Adresse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Angaben Zur Adresse</em>' attribute.
	 * @see #isSetAngabenZurAdresse()
	 * @see #unsetAngabenZurAdresse()
	 * @see #isAngabenZurAdresse()
	 * @generated
	 */
	void setAngabenZurAdresse(boolean value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AndererElternteilType#isAngabenZurAdresse <em>Angaben Zur Adresse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAngabenZurAdresse()
	 * @see #isAngabenZurAdresse()
	 * @see #setAngabenZurAdresse(boolean)
	 * @generated
	 */
	void unsetAngabenZurAdresse();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AndererElternteilType#isAngabenZurAdresse <em>Angaben Zur Adresse</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Angaben Zur Adresse</em>' attribute is set.
	 * @see #unsetAngabenZurAdresse()
	 * @see #isAngabenZurAdresse()
	 * @see #setAngabenZurAdresse(boolean)
	 * @generated
	 */
	boolean isSetAngabenZurAdresse();

	/**
	 * Returns the value of the '<em><b>Adresse</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Adresse</em>' containment reference.
	 * @see #setAdresse(PostalischeInlandsanschriftBasisType)
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.BeistandschaftPackage#getAndererElternteilType_Adresse()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='adresse' namespace='##targetNamespace'"
	 * @generated
	 */
	PostalischeInlandsanschriftBasisType getAdresse();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AndererElternteilType#getAdresse <em>Adresse</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Adresse</em>' containment reference.
	 * @see #getAdresse()
	 * @generated
	 */
	void setAdresse(PostalischeInlandsanschriftBasisType value);

	/**
	 * Returns the value of the '<em><b>Erreichbarkeit</b></em>' containment reference list.
	 * The list contents are of type {@link de.xoev.xfamilie.baukasten._1.baukasten.ErreichbarkeitType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angaben zur Erreichbarkeit des Elternteils.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Erreichbarkeit</em>' containment reference list.
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.BeistandschaftPackage#getAndererElternteilType_Erreichbarkeit()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='erreichbarkeit' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ErreichbarkeitType> getErreichbarkeit();

	/**
	 * Returns the value of the '<em><b>Anerkennung Vaterschaft</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Wenn bei Anliegensklärung die Codes v oder vu ausgewählt wurden: Ist der potentielle Vater des Kindes bereit die Vaterschaft anzuerkennen?
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Anerkennung Vaterschaft</em>' attribute.
	 * @see #isSetAnerkennungVaterschaft()
	 * @see #unsetAnerkennungVaterschaft()
	 * @see #setAnerkennungVaterschaft(boolean)
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.BeistandschaftPackage#getAndererElternteilType_AnerkennungVaterschaft()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='anerkennungVaterschaft' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isAnerkennungVaterschaft();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AndererElternteilType#isAnerkennungVaterschaft <em>Anerkennung Vaterschaft</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Anerkennung Vaterschaft</em>' attribute.
	 * @see #isSetAnerkennungVaterschaft()
	 * @see #unsetAnerkennungVaterschaft()
	 * @see #isAnerkennungVaterschaft()
	 * @generated
	 */
	void setAnerkennungVaterschaft(boolean value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AndererElternteilType#isAnerkennungVaterschaft <em>Anerkennung Vaterschaft</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAnerkennungVaterschaft()
	 * @see #isAnerkennungVaterschaft()
	 * @see #setAnerkennungVaterschaft(boolean)
	 * @generated
	 */
	void unsetAnerkennungVaterschaft();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AndererElternteilType#isAnerkennungVaterschaft <em>Anerkennung Vaterschaft</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Anerkennung Vaterschaft</em>' attribute is set.
	 * @see #unsetAnerkennungVaterschaft()
	 * @see #isAnerkennungVaterschaft()
	 * @see #setAnerkennungVaterschaft(boolean)
	 * @generated
	 */
	boolean isSetAnerkennungVaterschaft();

	/**
	 * Returns the value of the '<em><b>Weitere Angabenzum Anderen Elternteil</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Wenn bei der Anliegensklärung im Element anliegenBeistandschaft die Codes vu oder u enthalten sind, dann kann dieses Element optional befüllt werden.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Weitere Angabenzum Anderen Elternteil</em>' containment reference.
	 * @see #setWeitereAngabenzumAnderenElternteil(WeitereAngabenZumAnderenElternteilType)
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.BeistandschaftPackage#getAndererElternteilType_WeitereAngabenzumAnderenElternteil()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='weitereAngabenzumAnderenElternteil' namespace='##targetNamespace'"
	 * @generated
	 */
	WeitereAngabenZumAnderenElternteilType getWeitereAngabenzumAnderenElternteil();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AndererElternteilType#getWeitereAngabenzumAnderenElternteil <em>Weitere Angabenzum Anderen Elternteil</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Weitere Angabenzum Anderen Elternteil</em>' containment reference.
	 * @see #getWeitereAngabenzumAnderenElternteil()
	 * @generated
	 */
	void setWeitereAngabenzumAnderenElternteil(WeitereAngabenZumAnderenElternteilType value);

} // AndererElternteilType
