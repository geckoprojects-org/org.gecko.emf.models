/*
 */
package de.xoev.domea.domea;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Zeitraum Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Der Zeitraum kennzeichnet einen Abschnitt auf dem Zeitstrahl durch Angabe von Beginn und/oder Ende.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.domea.domea.ZeitraumType#getBeginn <em>Beginn</em>}</li>
 *   <li>{@link de.xoev.domea.domea.ZeitraumType#getEnde <em>Ende</em>}</li>
 * </ul>
 *
 * @see de.xoev.domea.domea.DomeaPackage#getZeitraumType()
 * @model extendedMetaData="name='ZeitraumType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ZeitraumType extends EObject {
	/**
	 * Returns the value of the '<em><b>Beginn</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Der Beginn eines Zeitraums beschreibt den Zeitpunkt, ab dem ein Sachverhalt eintritt bzw. rechtskräftig wirksam ist. Der Beginn ist immer Teil der Dauer des Zeitraumes. Beispiele sind: Fristbeginn Wirksamkeitsdatum der Änderung des Familiennamens Eheschließungsdatum
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Beginn</em>' attribute.
	 * @see #setBeginn(XMLGregorianCalendar)
	 * @see de.xoev.domea.domea.DomeaPackage#getZeitraumType_Beginn()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Date"
	 *        extendedMetaData="kind='element' name='Beginn' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getBeginn();

	/**
	 * Sets the value of the '{@link de.xoev.domea.domea.ZeitraumType#getBeginn <em>Beginn</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Beginn</em>' attribute.
	 * @see #getBeginn()
	 * @generated
	 */
	void setBeginn(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Ende</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Das Ende eines Zeitraumes beschreibt den Zeitpunkt, ab dem ein Sachverhalt endet bzw. nicht mehr rechtskräftig ist. Das Ende ist selbst Teil der Dauer des Zeitraumes. Beispiele sind: Fristdatum Ablaufdatum Fälligkeitsdatum Wirksamkeitsdatum der Aufhebung/Scheidung der Ehe
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ende</em>' attribute.
	 * @see #setEnde(XMLGregorianCalendar)
	 * @see de.xoev.domea.domea.DomeaPackage#getZeitraumType_Ende()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Date"
	 *        extendedMetaData="kind='element' name='Ende' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getEnde();

	/**
	 * Sets the value of the '{@link de.xoev.domea.domea.ZeitraumType#getEnde <em>Ende</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ende</em>' attribute.
	 * @see #getEnde()
	 * @generated
	 */
	void setEnde(XMLGregorianCalendar value);

} // ZeitraumType
