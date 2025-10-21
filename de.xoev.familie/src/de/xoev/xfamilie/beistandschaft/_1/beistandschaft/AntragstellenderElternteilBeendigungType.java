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

import de.xoev.xfamilie.baukasten._1.baukasten.GeburtType;
import de.xoev.xfamilie.baukasten._1.baukasten.NachweisdokumentType;
import de.xoev.xfamilie.baukasten._1.baukasten.NameNatuerlichePersonType;
import de.xoev.xfamilie.baukasten._1.baukasten.PostalischeInlandsanschriftBasisType;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Antragstellender Elternteil Beendigung Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AntragstellenderElternteilBeendigungType#getNamen <em>Namen</em>}</li>
 *   <li>{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AntragstellenderElternteilBeendigungType#getGeburtsdaten <em>Geburtsdaten</em>}</li>
 *   <li>{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AntragstellenderElternteilBeendigungType#getAdresse <em>Adresse</em>}</li>
 *   <li>{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AntragstellenderElternteilBeendigungType#isAbweichendeAdresse <em>Abweichende Adresse</em>}</li>
 *   <li>{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AntragstellenderElternteilBeendigungType#getAbweichendeAdressePerso <em>Abweichende Adresse Perso</em>}</li>
 *   <li>{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AntragstellenderElternteilBeendigungType#getAbweichendeAdresseNachweis <em>Abweichende Adresse Nachweis</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.BeistandschaftPackage#getAntragstellenderElternteilBeendigungType()
 * @model extendedMetaData="name='AntragstellenderElternteilBeendigungType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface AntragstellenderElternteilBeendigungType extends EObject {
	/**
	 * Returns the value of the '<em><b>Namen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Namen des beantragenden Elternteils.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Namen</em>' containment reference.
	 * @see #setNamen(NameNatuerlichePersonType)
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.BeistandschaftPackage#getAntragstellenderElternteilBeendigungType_Namen()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='namen' namespace='##targetNamespace'"
	 * @generated
	 */
	NameNatuerlichePersonType getNamen();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AntragstellenderElternteilBeendigungType#getNamen <em>Namen</em>}' containment reference.
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
	 * Geburtsdaten des beantragenden Elternteils.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Geburtsdaten</em>' containment reference.
	 * @see #setGeburtsdaten(GeburtType)
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.BeistandschaftPackage#getAntragstellenderElternteilBeendigungType_Geburtsdaten()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='geburtsdaten' namespace='##targetNamespace'"
	 * @generated
	 */
	GeburtType getGeburtsdaten();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AntragstellenderElternteilBeendigungType#getGeburtsdaten <em>Geburtsdaten</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Geburtsdaten</em>' containment reference.
	 * @see #getGeburtsdaten()
	 * @generated
	 */
	void setGeburtsdaten(GeburtType value);

	/**
	 * Returns the value of the '<em><b>Adresse</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Adresse des beantragenden Elternteils.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Adresse</em>' containment reference.
	 * @see #setAdresse(PostalischeInlandsanschriftBasisType)
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.BeistandschaftPackage#getAntragstellenderElternteilBeendigungType_Adresse()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='adresse' namespace='##targetNamespace'"
	 * @generated
	 */
	PostalischeInlandsanschriftBasisType getAdresse();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AntragstellenderElternteilBeendigungType#getAdresse <em>Adresse</em>}' containment reference.
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
	 * Angaben, ob die Anschrift von der im Personalausweis angegebenen Anschrift abweicht. True: Optionales Element abweichendeAdressePerso befüllen
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Abweichende Adresse</em>' attribute.
	 * @see #isSetAbweichendeAdresse()
	 * @see #unsetAbweichendeAdresse()
	 * @see #setAbweichendeAdresse(boolean)
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.BeistandschaftPackage#getAntragstellenderElternteilBeendigungType_AbweichendeAdresse()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='element' name='abweichendeAdresse' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isAbweichendeAdresse();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AntragstellenderElternteilBeendigungType#isAbweichendeAdresse <em>Abweichende Adresse</em>}' attribute.
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
	 * Unsets the value of the '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AntragstellenderElternteilBeendigungType#isAbweichendeAdresse <em>Abweichende Adresse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAbweichendeAdresse()
	 * @see #isAbweichendeAdresse()
	 * @see #setAbweichendeAdresse(boolean)
	 * @generated
	 */
	void unsetAbweichendeAdresse();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AntragstellenderElternteilBeendigungType#isAbweichendeAdresse <em>Abweichende Adresse</em>}' attribute is set.
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
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.BeistandschaftPackage#getAntragstellenderElternteilBeendigungType_AbweichendeAdressePerso()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='abweichendeAdressePerso' namespace='##targetNamespace'"
	 * @generated
	 */
	PostalischeInlandsanschriftBasisType getAbweichendeAdressePerso();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AntragstellenderElternteilBeendigungType#getAbweichendeAdressePerso <em>Abweichende Adresse Perso</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abweichende Adresse Perso</em>' containment reference.
	 * @see #getAbweichendeAdressePerso()
	 * @generated
	 */
	void setAbweichendeAdressePerso(PostalischeInlandsanschriftBasisType value);

	/**
	 * Returns the value of the '<em><b>Abweichende Adresse Nachweis</b></em>' containment reference list.
	 * The list contents are of type {@link de.xoev.xfamilie.baukasten._1.baukasten.NachweisdokumentType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abweichende Adresse Nachweis</em>' containment reference list.
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.BeistandschaftPackage#getAntragstellenderElternteilBeendigungType_AbweichendeAdresseNachweis()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='abweichendeAdresseNachweis' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<NachweisdokumentType> getAbweichendeAdresseNachweis();

} // AntragstellenderElternteilBeendigungType
