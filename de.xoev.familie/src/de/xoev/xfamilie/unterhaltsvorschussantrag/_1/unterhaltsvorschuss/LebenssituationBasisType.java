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
package de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lebenssituation Basis Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Daten zur Lebenssituation des antragstellenden Elternteils.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LebenssituationBasisType#getLedig <em>Ledig</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LebenssituationBasisType#getVerheiratet <em>Verheiratet</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LebenssituationBasisType#getLebenspartnerschaft <em>Lebenspartnerschaft</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LebenssituationBasisType#getGeschieden <em>Geschieden</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LebenssituationBasisType#getVerwitwet <em>Verwitwet</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LebenssituationBasisType#getLebenspartnerschaftAufgehoben <em>Lebenspartnerschaft Aufgehoben</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LebenssituationBasisType#getLebenspartnerVerstorben <em>Lebenspartner Verstorben</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getLebenssituationBasisType()
 * @model extendedMetaData="name='Lebenssituation.BasisType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface LebenssituationBasisType extends EObject {
	/**
	 * Returns the value of the '<em><b>Ledig</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Weitere Informationen zur Lebenssituation. Regel: Falls der Familienstand "ledig" ist.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ledig</em>' containment reference.
	 * @see #setLedig(LedigAntragstellendeBasisType)
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getLebenssituationBasisType_Ledig()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ledig' namespace='##targetNamespace'"
	 * @generated
	 */
	LedigAntragstellendeBasisType getLedig();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LebenssituationBasisType#getLedig <em>Ledig</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ledig</em>' containment reference.
	 * @see #getLedig()
	 * @generated
	 */
	void setLedig(LedigAntragstellendeBasisType value);

	/**
	 * Returns the value of the '<em><b>Verheiratet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Weitere Informationen zur Lebenssituation. Regel: Falls der Familienstand "verheiratet" ist.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Verheiratet</em>' containment reference.
	 * @see #setVerheiratet(VerheiratetAntragstellendeBasisType)
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getLebenssituationBasisType_Verheiratet()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='verheiratet' namespace='##targetNamespace'"
	 * @generated
	 */
	VerheiratetAntragstellendeBasisType getVerheiratet();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LebenssituationBasisType#getVerheiratet <em>Verheiratet</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Verheiratet</em>' containment reference.
	 * @see #getVerheiratet()
	 * @generated
	 */
	void setVerheiratet(VerheiratetAntragstellendeBasisType value);

	/**
	 * Returns the value of the '<em><b>Lebenspartnerschaft</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Weitere Informationen zur Lebenssituation. Regel: Falls der Familienstand "Lebenspartnerschaft" ist.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Lebenspartnerschaft</em>' containment reference.
	 * @see #setLebenspartnerschaft(LebenspartnerschaftAntragstellendeBasisType)
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getLebenssituationBasisType_Lebenspartnerschaft()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='lebenspartnerschaft' namespace='##targetNamespace'"
	 * @generated
	 */
	LebenspartnerschaftAntragstellendeBasisType getLebenspartnerschaft();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LebenssituationBasisType#getLebenspartnerschaft <em>Lebenspartnerschaft</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lebenspartnerschaft</em>' containment reference.
	 * @see #getLebenspartnerschaft()
	 * @generated
	 */
	void setLebenspartnerschaft(LebenspartnerschaftAntragstellendeBasisType value);

	/**
	 * Returns the value of the '<em><b>Geschieden</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Weitere Informationen zur Lebenssituation. Regel: Falls der Familienstand "geschieden" ist.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Geschieden</em>' containment reference.
	 * @see #setGeschieden(GeschiedenAntragstellendeBasisType)
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getLebenssituationBasisType_Geschieden()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='geschieden' namespace='##targetNamespace'"
	 * @generated
	 */
	GeschiedenAntragstellendeBasisType getGeschieden();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LebenssituationBasisType#getGeschieden <em>Geschieden</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Geschieden</em>' containment reference.
	 * @see #getGeschieden()
	 * @generated
	 */
	void setGeschieden(GeschiedenAntragstellendeBasisType value);

	/**
	 * Returns the value of the '<em><b>Verwitwet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Weitere Informationen zur Lebenssituation. Regel: Falls der Familienstand "verwitwet" ist.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Verwitwet</em>' containment reference.
	 * @see #setVerwitwet(VerwitwetAntragstellendeBasisType)
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getLebenssituationBasisType_Verwitwet()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='verwitwet' namespace='##targetNamespace'"
	 * @generated
	 */
	VerwitwetAntragstellendeBasisType getVerwitwet();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LebenssituationBasisType#getVerwitwet <em>Verwitwet</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Verwitwet</em>' containment reference.
	 * @see #getVerwitwet()
	 * @generated
	 */
	void setVerwitwet(VerwitwetAntragstellendeBasisType value);

	/**
	 * Returns the value of the '<em><b>Lebenspartnerschaft Aufgehoben</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Weitere Informationen zur Lebenssituation. Regel: Falls der Familienstand "Lebenspartnerschaft aufgehoben" ist.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Lebenspartnerschaft Aufgehoben</em>' containment reference.
	 * @see #setLebenspartnerschaftAufgehoben(LebenspartnerschaftAufgehobenAntragstellendeBasisType)
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getLebenssituationBasisType_LebenspartnerschaftAufgehoben()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='lebenspartnerschaftAufgehoben' namespace='##targetNamespace'"
	 * @generated
	 */
	LebenspartnerschaftAufgehobenAntragstellendeBasisType getLebenspartnerschaftAufgehoben();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LebenssituationBasisType#getLebenspartnerschaftAufgehoben <em>Lebenspartnerschaft Aufgehoben</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lebenspartnerschaft Aufgehoben</em>' containment reference.
	 * @see #getLebenspartnerschaftAufgehoben()
	 * @generated
	 */
	void setLebenspartnerschaftAufgehoben(LebenspartnerschaftAufgehobenAntragstellendeBasisType value);

	/**
	 * Returns the value of the '<em><b>Lebenspartner Verstorben</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Weitere Informationen zur Lebenssituation. Regel: Falls der Familienstand "Lebenspartner verstorben" ist.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Lebenspartner Verstorben</em>' containment reference.
	 * @see #setLebenspartnerVerstorben(LebenspartnerVerstorbenAntragstellendeBasisType)
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getLebenssituationBasisType_LebenspartnerVerstorben()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='lebenspartnerVerstorben' namespace='##targetNamespace'"
	 * @generated
	 */
	LebenspartnerVerstorbenAntragstellendeBasisType getLebenspartnerVerstorben();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LebenssituationBasisType#getLebenspartnerVerstorben <em>Lebenspartner Verstorben</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lebenspartner Verstorben</em>' containment reference.
	 * @see #getLebenspartnerVerstorben()
	 * @generated
	 */
	void setLebenspartnerVerstorben(LebenspartnerVerstorbenAntragstellendeBasisType value);

} // LebenssituationBasisType
