/*
 */
package de.xoev.domea.domea;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Anschrift Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Die Anschrift leitet sich von der entsprechenden XÖV-Kernkomponente ab. Sie beschreibt einen Ort mit den klassischen Ordnungsbegriffen wie Orts- und Straßennamen sowie ergänzenden Informationen wie z. B. Postfach. Eine Anschrift kann genutzt werden, um Orte zu benennen, an denen sich Personen aufhalten, an denen Objekte zu finden sind, oder an denen Ereignisse stattfinden. Darüber hinaus kann sie genutzt werden, um Post oder Waren zuzustellen. Daher enthält sie auch die notwendigen Attribute, um Postfächer zu adressieren.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.domea.domea.AnschriftType#getStaat <em>Staat</em>}</li>
 *   <li>{@link de.xoev.domea.domea.AnschriftType#getStrasse <em>Strasse</em>}</li>
 *   <li>{@link de.xoev.domea.domea.AnschriftType#getHausnummer <em>Hausnummer</em>}</li>
 *   <li>{@link de.xoev.domea.domea.AnschriftType#getPostfach <em>Postfach</em>}</li>
 *   <li>{@link de.xoev.domea.domea.AnschriftType#getPostleitzahl <em>Postleitzahl</em>}</li>
 *   <li>{@link de.xoev.domea.domea.AnschriftType#getOrt <em>Ort</em>}</li>
 *   <li>{@link de.xoev.domea.domea.AnschriftType#getZusatz <em>Zusatz</em>}</li>
 *   <li>{@link de.xoev.domea.domea.AnschriftType#getTyp <em>Typ</em>}</li>
 * </ul>
 *
 * @see de.xoev.domea.domea.DomeaPackage#getAnschriftType()
 * @model extendedMetaData="name='AnschriftType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface AnschriftType extends EObject {
	/**
	 * Returns the value of the '<em><b>Staat</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Der Staat, dem die Anschrift postalisch zugeordnet wird.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Staat</em>' containment reference.
	 * @see #setStaat(StaatType)
	 * @see de.xoev.domea.domea.DomeaPackage#getAnschriftType_Staat()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Staat' namespace='##targetNamespace'"
	 * @generated
	 */
	StaatType getStaat();

	/**
	 * Sets the value of the '{@link de.xoev.domea.domea.AnschriftType#getStaat <em>Staat</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Staat</em>' containment reference.
	 * @see #getStaat()
	 * @generated
	 */
	void setStaat(StaatType value);

	/**
	 * Returns the value of the '<em><b>Strasse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Die Straße enthält den Namen bzw. die Bezeichnung einer Straße. Eine Straße ist ein planmäßig angelegter, i. allg. befestigter Verkehrsweg innerhalb eines Ortes. Es soll möglichst der amtliche Straßenname aus einem offiziellen Straßenverzeichnis genutzt werden.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Strasse</em>' attribute.
	 * @see #setStrasse(String)
	 * @see de.xoev.domea.domea.DomeaPackage#getAnschriftType_Strasse()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='Strasse' namespace='##targetNamespace'"
	 * @generated
	 */
	String getStrasse();

	/**
	 * Sets the value of the '{@link de.xoev.domea.domea.AnschriftType#getStrasse <em>Strasse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Strasse</em>' attribute.
	 * @see #getStrasse()
	 * @generated
	 */
	void setStrasse(String value);

	/**
	 * Returns the value of the '<em><b>Hausnummer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Eine Hausnummer dient der genauen Lokalisierung eines Grundstücks, Gebäudes oder Gebäudeteils (Eingang) in einer Straße. Hausnummern können entsprechend der üblichen Praxis in vielen Gemeinden mit ergänzenden Angaben zur weiteren Unterteilung versehen werden, etwa "12a" oder "17 1/3". Da manche Gebäude oder Organisationen sich als Einheit über mehrere Hausnummern erstrecken, können auch Hausnummernbereiche angegeben werden, etwa "12a - 12e" oder "1 - 3".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hausnummer</em>' attribute.
	 * @see #setHausnummer(String)
	 * @see de.xoev.domea.domea.DomeaPackage#getAnschriftType_Hausnummer()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='Hausnummer' namespace='##targetNamespace'"
	 * @generated
	 */
	String getHausnummer();

	/**
	 * Sets the value of the '{@link de.xoev.domea.domea.AnschriftType#getHausnummer <em>Hausnummer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hausnummer</em>' attribute.
	 * @see #getHausnummer()
	 * @generated
	 */
	void setHausnummer(String value);

	/**
	 * Returns the value of the '<em><b>Postfach</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ein Postfach (oft Postfachnummer) ist ein Schlüssel zur Identifikation eines Postfaches in einer Postfiliale. Eine Beschränkung auf numerische Postfachbezeichnungen wurde bewusst nicht vorgenommen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Postfach</em>' attribute.
	 * @see #setPostfach(String)
	 * @see de.xoev.domea.domea.DomeaPackage#getAnschriftType_Postfach()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='Postfach' namespace='##targetNamespace'"
	 * @generated
	 */
	String getPostfach();

	/**
	 * Sets the value of the '{@link de.xoev.domea.domea.AnschriftType#getPostfach <em>Postfach</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Postfach</em>' attribute.
	 * @see #getPostfach()
	 * @generated
	 */
	void setPostfach(String value);

	/**
	 * Returns the value of the '<em><b>Postleitzahl</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Eine Postleitzahl ist eine Angabe, um postalische Zustellgebiete unabhängig von Gebietskörperschaften (Gemeinde, Kreis, ...) zu bezeichnen. In Deutschland sind durch Postleitzahlen bezeichnete Bereiche und verwaltungspolitische Grenzen in der Regel aufeinander abgestimmt. Größere Gemeinden und Städte sind häufig in mehrere Postleitzahlengebiete aufgeteilt. Postleitzahlen werden durch die Deutsche Post AG verwaltet. Eine Beschränkung auf deutsche Postleitzahlen (5-stellig) wurde bewusst nicht vorgenommen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Postleitzahl</em>' attribute.
	 * @see #setPostleitzahl(String)
	 * @see de.xoev.domea.domea.DomeaPackage#getAnschriftType_Postleitzahl()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='Postleitzahl' namespace='##targetNamespace'"
	 * @generated
	 */
	String getPostleitzahl();

	/**
	 * Sets the value of the '{@link de.xoev.domea.domea.AnschriftType#getPostleitzahl <em>Postleitzahl</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Postleitzahl</em>' attribute.
	 * @see #getPostleitzahl()
	 * @generated
	 */
	void setPostleitzahl(String value);

	/**
	 * Returns the value of the '<em><b>Ort</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Der Ort enthält den Namen eines Ortes (Gemeinde, Ortschaft oder Stadt). Als Ortsname sollte der amtliche Gemeindename genutzt werden.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ort</em>' attribute.
	 * @see #setOrt(String)
	 * @see de.xoev.domea.domea.DomeaPackage#getAnschriftType_Ort()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='Ort' namespace='##targetNamespace'"
	 * @generated
	 */
	String getOrt();

	/**
	 * Sets the value of the '{@link de.xoev.domea.domea.AnschriftType#getOrt <em>Ort</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ort</em>' attribute.
	 * @see #getOrt()
	 * @generated
	 */
	void setOrt(String value);

	/**
	 * Returns the value of the '<em><b>Zusatz</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ein Anschriftenzusatz beinhaltet ggf. erforderliche weitere Präzisierungen zu einer Anschrift.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Zusatz</em>' attribute.
	 * @see #setZusatz(String)
	 * @see de.xoev.domea.domea.DomeaPackage#getAnschriftType_Zusatz()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='Zusatz' namespace='##targetNamespace'"
	 * @generated
	 */
	String getZusatz();

	/**
	 * Sets the value of the '{@link de.xoev.domea.domea.AnschriftType#getZusatz <em>Zusatz</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zusatz</em>' attribute.
	 * @see #getZusatz()
	 * @generated
	 */
	void setZusatz(String value);

	/**
	 * Returns the value of the '<em><b>Typ</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Im Typ wird beschrieben, um welche Art der Anschrift es sich handelt.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Typ</em>' containment reference.
	 * @see #setTyp(AnschriftstypCodeType)
	 * @see de.xoev.domea.domea.DomeaPackage#getAnschriftType_Typ()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Typ' namespace='##targetNamespace'"
	 * @generated
	 */
	AnschriftstypCodeType getTyp();

	/**
	 * Sets the value of the '{@link de.xoev.domea.domea.AnschriftType#getTyp <em>Typ</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Typ</em>' containment reference.
	 * @see #getTyp()
	 * @generated
	 */
	void setTyp(AnschriftstypCodeType value);

} // AnschriftType
